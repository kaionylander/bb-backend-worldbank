package org.bb.backend.worldbank.domain.usecase;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;
import org.bb.backend.worldbank.domain.usecase.impl.IndicatorsUseCase;
import org.bb.backend.worldbank.infra.client.impl.WorldBankClientServiceImpl;
import org.bb.backend.worldbank.infra.client.response.DataPoint;
import org.bb.backend.worldbank.util.IndicatorsFixture;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.any;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.wildfly.common.Assert.assertNotNull;

import org.mockito.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class IndicatorsUseCaseTest {

    @InjectMocks
    private IndicatorsUseCase indicatorsUseCase;

    @Mock
    private WorldBankClientServiceImpl worldBankClientService;

    @Mock
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetIndicatorsByCountry_Success() throws Exception {
        String countryCode = "US";
        String jsonResponse = IndicatorsFixture.generateJsonResponse();

        // Mockando o retorno do método getIndicatorsByCountry do WorldBankClientServiceImpl
        when(worldBankClientService.getIndicatorsByCountry(anyString(), anyString())).thenReturn(jsonResponse);

        // Mockando o retorno dos métodos readTree e readValue do ObjectMapper
        JsonNode mockJsonNode = Mockito.mock(JsonNode.class);
        JsonNode mockDataNode = Mockito.mock(JsonNode.class);
        JsonNode mockMetadataNode = Mockito.mock(JsonNode.class);
        when(objectMapper.readTree(jsonResponse)).thenReturn(mockJsonNode);
        when(mockJsonNode.get(1)).thenReturn(mockDataNode);
        when(mockJsonNode.get(0)).thenReturn(mockMetadataNode);
        when(objectMapper.readValue(Mockito.anyString(), Mockito.any(TypeReference.class)))
                .thenReturn(new ArrayList<>());

        // Chama o método sendo testado
        IndicatorsResponse result = indicatorsUseCase.getIndicatorsByCountry(countryCode);

        // Verificações de assert
        assertNotNull(result);
        assertNotNull(result.getDataPoint());
        assertTrue(result.getDataPoint().isEmpty());

        // Verifica se os métodos do mock foram chamados corretamente
        verify(worldBankClientService).getIndicatorsByCountry(countryCode, "json");
        verify(objectMapper).readTree(jsonResponse);
        verify(objectMapper).readValue(anyString(), Mockito.<TypeReference<List<DataPoint>>>any());
        verify(mockJsonNode).get(1);
        verify(mockJsonNode).get(0);
    }

}