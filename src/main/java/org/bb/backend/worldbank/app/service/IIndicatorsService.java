package org.bb.backend.worldbank.app.service;

import org.bb.backend.worldbank.infra.client.response.WorldBankData;

public interface IIndicatorsService {

    WorldBankData getIndicatorsByCountry(String countryCode);

}
