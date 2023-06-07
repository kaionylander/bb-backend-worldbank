package org.bb.backend.worldbank.util;

import org.bb.backend.worldbank.app.rest.response.DataPointResponse;
import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;
import org.bb.backend.worldbank.infra.client.response.Country;
import org.bb.backend.worldbank.infra.client.response.Indicator;

import java.util.ArrayList;
import java.util.List;

public abstract class IndicatorsFixture {

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

    public static String generateJsonResponse() {
        return "[{\n" +
                "\t\t\"page\": 1,\n" +
                "\t\t\"pages\": 2,\n" +
                "\t\t\"per_page\": 50,\n" +
                "\t\t\"total\": 63,\n" +
                "\t\t\"sourceid\": \"2\",\n" +
                "\t\t\"lastupdated\": \"2023-05-10\"\n" +
                "\t},\n" +
                "\t[{\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2022\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2021\",\n" +
                "\t\t\"value\": 5.8,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2020\",\n" +
                "\t\t\"value\": 1.9,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2019\",\n" +
                "\t\t\"value\": 5.4,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2018\",\n" +
                "\t\t\"value\": 5.3,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2017\",\n" +
                "\t\t\"value\": 5.3,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2016\",\n" +
                "\t\t\"value\": 4.7,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2015\",\n" +
                "\t\t\"value\": 3.9,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2014\",\n" +
                "\t\t\"value\": 3.3,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2013\",\n" +
                "\t\t\"value\": 3.7,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2012\",\n" +
                "\t\t\"value\": 4.5,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2011\",\n" +
                "\t\t\"value\": 5.3,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2010\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2009\",\n" +
                "\t\t\"value\": 6.1,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2008\",\n" +
                "\t\t\"value\": 6.5,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2007\",\n" +
                "\t\t\"value\": 7.9,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2006\",\n" +
                "\t\t\"value\": 8.3,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2005\",\n" +
                "\t\t\"value\": 10,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2004\",\n" +
                "\t\t\"value\": 11.1,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2003\",\n" +
                "\t\t\"value\": 12.6,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2002\",\n" +
                "\t\t\"value\": 11.7,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2001\",\n" +
                "\t\t\"value\": 13,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"2000\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1999\",\n" +
                "\t\t\"value\": 15,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1998\",\n" +
                "\t\t\"value\": 14.3,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1997\",\n" +
                "\t\t\"value\": 16,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1996\",\n" +
                "\t\t\"value\": 16,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1995\",\n" +
                "\t\t\"value\": 14.7,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1994\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1993\",\n" +
                "\t\t\"value\": 22.1,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1992\",\n" +
                "\t\t\"value\": 23.3,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1991\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1990\",\n" +
                "\t\t\"value\": 24,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1989\",\n" +
                "\t\t\"value\": 20.4,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1988\",\n" +
                "\t\t\"value\": 22.4,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1987\",\n" +
                "\t\t\"value\": 19.9,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1986\",\n" +
                "\t\t\"value\": 12.3,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1985\",\n" +
                "\t\t\"value\": 25.8,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1984\",\n" +
                "\t\t\"value\": 29.9,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1983\",\n" +
                "\t\t\"value\": 30.6,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1982\",\n" +
                "\t\t\"value\": 24.4,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1981\",\n" +
                "\t\t\"value\": 23.9,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1980\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1979\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1978\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1977\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1976\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1975\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1974\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}, {\n" +
                "\t\t\"indicator\": {\n" +
                "\t\t\t\"id\": \"SI.POV.DDAY\",\n" +
                "\t\t\t\"value\": \"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"\n" +
                "\t\t},\n" +
                "\t\t\"country\": {\n" +
                "\t\t\t\"id\": \"BR\",\n" +
                "\t\t\t\"value\": \"Brazil\"\n" +
                "\t\t},\n" +
                "\t\t\"countryiso3code\": \"BRA\",\n" +
                "\t\t\"date\": \"1973\",\n" +
                "\t\t\"value\": null,\n" +
                "\t\t\"unit\": \"\",\n" +
                "\t\t\"obs_status\": \"\",\n" +
                "\t\t\"decimal\": 1\n" +
                "\t}]\n" +
                "]";
    }

    public static String generateJsonResponseClient() {
        return "[{\"page\":1,\"pages\":2,\"per_page\":50,\"total\":63,\"sourceid\":\"2\",\"lastupdated\":\"2023-05-10\"},[{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2022\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2021\",\"value\":5.8,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2020\",\"value\":1.9,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2019\",\"value\":5.4,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2018\",\"value\":5.3,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2017\",\"value\":5.3,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2016\",\"value\":4.7,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2015\",\"value\":3.9,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2014\",\"value\":3.3,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2013\",\"value\":3.7,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2012\",\"value\":4.5,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2011\",\"value\":5.3,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2010\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2009\",\"value\":6.1,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2008\",\"value\":6.5,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2007\",\"value\":7.9,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2006\",\"value\":8.3,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2005\",\"value\":10,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2004\",\"value\":11.1,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2003\",\"value\":12.6,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2002\",\"value\":11.7,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2001\",\"value\":13,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"2000\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1999\",\"value\":15,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1998\",\"value\":14.3,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1997\",\"value\":16,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1996\",\"value\":16,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1995\",\"value\":14.7,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1994\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1993\",\"value\":22.1,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1992\",\"value\":23.3,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1991\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1990\",\"value\":24,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1989\",\"value\":20.4,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1988\",\"value\":22.4,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1987\",\"value\":19.9,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1986\",\"value\":12.3,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1985\",\"value\":25.8,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1984\",\"value\":29.9,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1983\",\"value\":30.6,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1982\",\"value\":24.4,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1981\",\"value\":23.9,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1980\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1979\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1978\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1977\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1976\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1975\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1974\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1},{\"indicator\":{\"id\":\"SI.POV.DDAY\",\"value\":\"Poverty headcount ratio at $2.15 a day (2017 PPP) (% of population)\"},\"country\":{\"id\":\"BR\",\"value\":\"Brazil\"},\"countryiso3code\":\"BRA\",\"date\":\"1973\",\"value\":null,\"unit\":\"\",\"obs_status\":\"\",\"decimal\":1}]]";
    }

}
