package org.bb.backend.worldbank.app.rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.bb.backend.worldbank.client.WorldBankClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/worldbank")
public class IndicatorsResource {

    @Inject
    @RestClient
    WorldBankClient worldBankClient;

    @GET
    @Path("/indicators")
    @Produces(MediaType.APPLICATION_JSON)
    public String getIndicators(@QueryParam("countryCode") String countryCode) {
        return worldBankClient.getIndicatorsByCountry(countryCode);
    }


}
