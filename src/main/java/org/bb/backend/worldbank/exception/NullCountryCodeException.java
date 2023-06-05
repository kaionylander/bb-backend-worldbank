package org.bb.backend.worldbank.exception;
public class NullCountryCodeException extends RuntimeException {
    public NullCountryCodeException() {
        super("O campo 'countryCode' não pode ser nulo.");
    }
}
