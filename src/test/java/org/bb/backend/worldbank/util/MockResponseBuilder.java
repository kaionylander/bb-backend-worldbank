package org.bb.backend.worldbank.util;

import org.bb.backend.worldbank.app.rest.response.DataPointResponse;
import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;
import org.bb.backend.worldbank.infra.client.response.Country;
import org.bb.backend.worldbank.infra.client.response.DataPoint;
import org.bb.backend.worldbank.infra.client.response.Indicator;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public abstract class MockResponseBuilder {

    public static IndicatorsResponse createIndicatorsResponseMock() {

        IndicatorsResponse indicatorsResponse = new IndicatorsResponse();
        List<DataPointResponse> dataPointResponseList = new ArrayList<>();

        DataPointResponse dataPoint1 = new DataPointResponse();
        dataPoint1.setDate("2021");
        dataPoint1.setValue(5.8);

        Indicator indicator1 = new Indicator();
        indicator1.setId("SI.POV.DDAY");
        indicator1.setValue("Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)");
        dataPoint1.setIndicator(indicator1);

        Country country1 = new Country();
        country1.setId("BR");
        country1.setValue("Brazil");
        dataPoint1.setCountry(country1);

        DataPointResponse dataPoint2 = new DataPointResponse();
        dataPoint2.setDate("2021");
        dataPoint2.setValue(5.8);

        Indicator indicator2 = new Indicator();
        indicator2.setId("SI.POV.DDAY");
        indicator2.setValue("Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)");
        dataPoint2.setIndicator(indicator2);

        Country country2 = new Country();
        country2.setId("BR");
        country2.setValue("Brazil");
        dataPoint2.setCountry(country2);

        dataPointResponseList.add(dataPoint1);
        dataPointResponseList.add(dataPoint2);

        indicatorsResponse.setDataPoint(dataPointResponseList);

        return indicatorsResponse;
    }

}
