package org.bb.backend.worldbank.app.rest;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/worldbank")
public class IndicatorsResource {

    @GET
    @Path("/indicators")
    @Produces(MediaType.APPLICATION_JSON)
    public String getIndicators(@QueryParam("countryCode") String countryCode) {
        return countryCode;
    }


}
