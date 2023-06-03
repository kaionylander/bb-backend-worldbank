package org.bb.backend.worldbank.domain.usecase.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.app.rest.response.DataPointResponse;
import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;
import org.bb.backend.worldbank.domain.usecase.IIndicatorsUseCase;
import org.bb.backend.worldbank.infra.client.impl.WorldBankClientServiceImpl;
import org.bb.backend.worldbank.infra.client.response.*;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class IndicatorsUseCase implements IIndicatorsUseCase {

    @Inject
    WorldBankClientServiceImpl worldBankClientService;
    static final String FORMAT = "json";
    @Inject
    private ObjectMapper objectMapper;

    @Override
    public IndicatorsResponse getIndicatorsByCountry(String countryCode) {

        try {

            String jsonResponse = worldBankClientService.getIndicatorsByCountry(countryCode, FORMAT);

            // Parse the JSON array containing DataPoint objects
            JsonNode jsonNode = objectMapper.readTree(jsonResponse);
            JsonNode dataNode = jsonNode.get(1); // Get the second element in the array (the data)

            // Deserialize the DataPoint objects
            List<DataPoint> dataPoints = objectMapper.readValue(dataNode.toString(), new TypeReference<List<DataPoint>>() {});

            // Extract metadata information
            JsonNode metadataNode = jsonNode.get(0); // Get the first element in the array (the metadata)
            Metadata metadata = objectMapper.readValue(metadataNode.toString(), Metadata.class);

            // Create a new indicatorsResponse object and set the data points
            IndicatorsResponse indicatorsResponse = new IndicatorsResponse();
            indicatorsResponse.setDataPoint(mapDataPointsToResponse(dataPoints));
            return indicatorsResponse;

        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    private List<DataPointResponse> mapDataPointsToResponse(List<DataPoint> dataPoints) {
        List<DataPointResponse> dataPointResponses = new ArrayList<>();
        for (DataPoint dataPoint : dataPoints) {
            DataPointResponse dataPointResponse = new DataPointResponse();
            // Map the properties from DataPoint to DataPointResponse
            dataPointResponse.setIndicator(dataPoint.getIndicator());
            dataPointResponse.setCountry(dataPoint.getCountry());
            dataPointResponse.setDate(dataPoint.getDate());
            dataPointResponse.setValue(dataPoint.getValue());
            // Map other properties as needed
            dataPointResponses.add(dataPointResponse);
        }
        return dataPointResponses;
    }
}