package org.bb.backend.worldbank.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/v2/country/{countryCode}/indicator/SI.POV.DDAY")
@RegisterRestClient(configKey = "worldbank-api")
public interface WorldBankClient {

    @GET
    @Path("/?format=json")
    @Produces(MediaType.APPLICATION_JSON)
    String getIndicatorsByCountry(@PathParam("countryCode") String countryCode);

}
