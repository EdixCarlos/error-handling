package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequestException extends CustomException {
    public BadRequestException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return "The request could not be understood by the server due to malformed syntax.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
