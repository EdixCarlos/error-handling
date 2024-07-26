package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class TypeMismatchException extends CustomException {
    public TypeMismatchException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return "The type of the provided value did not match the expected type.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
