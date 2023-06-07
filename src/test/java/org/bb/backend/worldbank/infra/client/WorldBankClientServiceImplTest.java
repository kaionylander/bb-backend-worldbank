package org.bb.backend.worldbank.infra.client;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.infra.client.impl.WorldBankClientServiceImpl;
import org.bb.backend.worldbank.util.IndicatorsFixture;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@QuarkusTest
public class WorldBankClientServiceImplTest {

    @Inject
    WorldBankClientServiceImpl worldBankClientService;

    @Mock
    @RestClient
    IWorldBankClientService mockClientService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetIndicatorsByCountry() {
        // Configura o comportamento esperado do mock
        String expectedResponse = IndicatorsFixture.generateJsonResponseClient();
        String countryCode = "BR";
        String format = "json";
        Mockito.when(mockClientService.getIndicatorsByCountry(countryCode, format)).thenReturn(expectedResponse);

        // Chama o método sendo testado
        String result = worldBankClientService.getIndicatorsByCountry(countryCode, format);

        // Verificações de assert
        Assertions.assertEquals(expectedResponse, result);
    }
}
