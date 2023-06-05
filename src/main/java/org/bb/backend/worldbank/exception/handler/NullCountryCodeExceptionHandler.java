package org.bb.backend.worldbank.exception.handler;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.bb.backend.worldbank.exception.NullCountryCodeException;
@Provider
public class NullCountryCodeExceptionHandler implements ExceptionMapper<NullCountryCodeException> {
    @Override
    public Response toResponse(NullCountryCodeException exception) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(exception.getMessage())
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }
}