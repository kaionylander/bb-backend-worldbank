package org.bb.backend.worldbank.domain.usecase;

import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;

public interface IIndicatorsUseCase {

    IndicatorsResponse getIndicatorsByCountry(String countryCode);

}