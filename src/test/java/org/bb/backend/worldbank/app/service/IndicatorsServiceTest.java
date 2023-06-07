package org.bb.backend.worldbank.app.service;

import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;
import org.bb.backend.worldbank.app.service.impl.IndicatorsService;
import org.bb.backend.worldbank.domain.usecase.IIndicatorsUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class IndicatorsServiceTest {

    @Mock
    private IIndicatorsUseCase indicatorsUseCase;

    @InjectMocks
    private IndicatorsService indicatorsService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetIndicatorsByCountry() {
        String countryCode = "US";
        IndicatorsResponse expectedResponse = new IndicatorsResponse();

        // Mock the behavior of the indicatorsUseCase
        when(indicatorsUseCase.getIndicatorsByCountry(countryCode)).thenReturn(expectedResponse);

        // Call the method being tested
        IndicatorsResponse actualResponse = indicatorsService.getIndicatorsByCountry(countryCode);

        // Verify the result
        assertEquals(expectedResponse, actualResponse);
    }
}