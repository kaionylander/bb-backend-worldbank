package org.bb.backend.worldbank.infra.client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.bb.backend.worldbank.util.WorldBankClientInterceptor;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/v2/country/{countryCode}/indicator/SI.POV.DDAY")
@RegisterRestClient(configKey = "worldbank-api")
@RegisterProvider(WorldBankClientInterceptor.class)
public interface IWorldBankClientService {

    public final String TEXT_CSS = "text/css";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String getIndicatorsByCountry(@PathParam("countryCode") String countryCode, @QueryParam("format") String format);

}
