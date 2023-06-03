package org.bb.backend.worldbank.domain.usecase.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.domain.usecase.IIndicatorsUseCase;
import org.bb.backend.worldbank.infra.client.impl.WorldBankClientServiceImpl;

@ApplicationScoped
public class IndicatorsUseCase implements IIndicatorsUseCase {

    @Inject
    WorldBankClientServiceImpl worldBankClientService;

    @Override
    public String getIndicatorsByCountry(String countryCode) {

        return worldBankClientService.getIndicatorsByCountry(countryCode);

    }

}
