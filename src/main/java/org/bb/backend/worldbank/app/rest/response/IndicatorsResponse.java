package org.bb.backend.worldbank.app.rest.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IndicatorsResponse {
    private List<DataPointResponse> dataPoint;

}