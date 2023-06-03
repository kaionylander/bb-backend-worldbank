package org.bb.backend.worldbank.app.rest.response;

import lombok.Getter;
import lombok.Setter;
import org.bb.backend.worldbank.app.rest.response.DataPointResponse;

import java.util.List;

@Getter
@Setter
public class IndicatorsResponse {
    private List<DataPointResponse> dataPoint;

}
