package org.bb.backend.worldbank.app.service;

import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;

public interface IIndicatorsService {
    IndicatorsResponse getIndicatorsByCountry(String countryCode);

}