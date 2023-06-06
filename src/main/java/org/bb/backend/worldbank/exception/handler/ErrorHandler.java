package org.bb.backend.worldbank.exception.handler;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ErrorHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        String errorMessage = "Erro ao consultar indicadores - Serviço indisponível";
        return Response.status(500).entity(errorMessage).build();
    }
}