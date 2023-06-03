package org.bb.backend.worldbank.domain.usecase;

import org.bb.backend.worldbank.infra.client.response.WorldBankData;

public interface IIndicatorsUseCase {

    WorldBankData getIndicatorsByCountry(String countryCode);

}
