package org.bb.backend.worldbank.app.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.app.service.IIndicatorsService;
import org.bb.backend.worldbank.domain.usecase.IIndicatorsUseCase;
import org.bb.backend.worldbank.infra.client.response.WorldBankData;

@ApplicationScoped
public class IndicatorsService implements IIndicatorsService {

    @Inject
    IIndicatorsUseCase indicatorsUseCase;

    @Override
    public WorldBankData getIndicatorsByCountry(String countryCode) {

        return indicatorsUseCase.getIndicatorsByCountry(countryCode);

    }
}