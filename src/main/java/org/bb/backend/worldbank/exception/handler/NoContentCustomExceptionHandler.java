package org.bb.backend.worldbank.exception.handler;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.bb.backend.worldbank.exception.NoContentCustomException;

@Provider
public class NoContentCustomExceptionHandler implements ExceptionMapper<NoContentCustomException> {

    @Override
    public Response toResponse(NoContentCustomException exception) {
        return Response.status(Response.Status.NO_CONTENT)
                .build();
    }
}