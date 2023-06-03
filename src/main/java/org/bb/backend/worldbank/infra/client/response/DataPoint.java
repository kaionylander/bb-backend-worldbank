package org.bb.backend.worldbank.infra.client.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataPoint {

    private Indicator indicator;
    private Country country;
    private String countryiso3code;
    private String date;
    private Double value;
    private String unit;
    private String obs_status;
    private Integer decimal;

}