package org.bb.backend.worldbank.exception;
public class NoContentCustomException extends RuntimeException {
    public NoContentCustomException() {
        super("Nenhum registro encontrado.");
    }

}
