package org.bb.backend.worldbank.domain.usecase.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.domain.usecase.IIndicatorsUseCase;
import org.bb.backend.worldbank.infra.client.impl.WorldBankClientServiceImpl;
import org.bb.backend.worldbank.infra.client.response.DataPoint;
import org.bb.backend.worldbank.infra.client.response.Metadata;
import org.bb.backend.worldbank.infra.client.response.WorldBankData;

import java.util.List;

@ApplicationScoped
public class IndicatorsUseCase implements IIndicatorsUseCase {

    @Inject
    WorldBankClientServiceImpl worldBankClientService;

    @Inject
    private ObjectMapper objectMapper;

    @Override
    public WorldBankData getIndicatorsByCountry(String countryCode) {

        try {

            String jsonResponse = worldBankClientService.getIndicatorsByCountry(countryCode);

            // Parse the JSON array containing DataPoint objects
            JsonNode jsonNode = objectMapper.readTree(jsonResponse);
            JsonNode dataNode = jsonNode.get(1); // Get the second element in the array (the data)

            // Deserialize the DataPoint objects
            List<DataPoint> dataPoints = objectMapper.readValue(dataNode.toString(), new TypeReference<List<DataPoint>>() {});

            // Extract metadata information
            JsonNode metadataNode = jsonNode.get(0); // Get the first element in the array (the metadata)
            Metadata metadata = objectMapper.readValue(metadataNode.toString(), Metadata.class);

            // Create a new WorldBankData object and set the data points
            WorldBankData worldBankData = new WorldBankData();
            worldBankData.setData(dataPoints);
            worldBankData.setMetadata(metadata);

            return worldBankData;

        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}