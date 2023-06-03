package org.bb.backend.worldbank.app.rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.bb.backend.worldbank.app.service.IIndicatorsService;
import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;

@Path("/worldbank")
public class IndicatorsResource {

    @Inject
    IIndicatorsService indicatorsService;


    @GET
    @Path("/indicators")
    @Produces(MediaType.APPLICATION_JSON)
    public IndicatorsResponse getIndicators(@QueryParam("countryCode") String countryCode) {
        return indicatorsService.getIndicatorsByCountry(countryCode);
    }

}