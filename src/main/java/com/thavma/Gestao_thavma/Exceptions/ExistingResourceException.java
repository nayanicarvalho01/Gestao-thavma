package com.thavma.Gestao_thavma.Exceptions;

public class ExistingResourceException extends RuntimeException {
    public ExistingResourceException(String message) {
        super(message);
    }
}
