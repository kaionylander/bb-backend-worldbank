package org.bb.backend.worldbank.infra.client.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.infra.client.IWorldBankClientService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class WorldBankClientServiceImpl {

    @Inject
    @RestClient
    IWorldBankClientService worldBankClientService;

    public String getIndicatorsByCountry(String countryCode, String format) {

        return worldBankClientService.getIndicatorsByCountry(countryCode, format);

    }

}