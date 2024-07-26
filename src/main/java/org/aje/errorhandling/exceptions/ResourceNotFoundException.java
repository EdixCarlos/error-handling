package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends CustomException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    public String getErrorDescription() {
        return "Resource not found.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }


}