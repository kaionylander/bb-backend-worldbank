package org.bb.backend.worldbank.app.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.app.service.IIndicatorsService;
import org.bb.backend.worldbank.domain.usecase.IIndicatorsUseCase;

@ApplicationScoped
public class IndicatorsService implements IIndicatorsService {

    @Inject
    IIndicatorsUseCase indicatorsUseCase;

    @Override
    public String getIndicatorsByCountry(String countryCode) {

        return indicatorsUseCase.getIndicatorsByCountry(countryCode);

    }
}
