package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public abstract class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }

    public abstract HttpStatus getHttpStatus();
    public abstract String getErrorDescription();

    public abstract String getErrorDescription(String message);

}
