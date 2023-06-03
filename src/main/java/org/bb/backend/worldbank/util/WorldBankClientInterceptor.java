package org.bb.backend.worldbank.util;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.UriBuilder;

public class WorldBankClientInterceptor implements ClientRequestFilter {

    @Override
    public void filter(ClientRequestContext requestContext) {
        String baseUri = requestContext.getUri().toString();
        String requestUri = UriBuilder.fromUri(baseUri).build().toString();

        System.out.println("Generated URL: " + requestUri);
    }
}
