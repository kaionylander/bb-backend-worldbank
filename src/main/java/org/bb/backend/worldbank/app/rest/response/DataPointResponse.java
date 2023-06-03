package org.bb.backend.worldbank.app.rest.response;

import lombok.Getter;
import lombok.Setter;
import org.bb.backend.worldbank.infra.client.response.Country;
import org.bb.backend.worldbank.infra.client.response.Indicator;

@Getter
@Setter
public class DataPointResponse {

    private Indicator indicator;
    private Country country;
    private String date;
    private Double value;

}
