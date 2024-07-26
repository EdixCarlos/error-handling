package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class WebServiceIOException extends CustomException {
    public WebServiceIOException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_GATEWAY;
    }

    @Override
    public String getErrorDescription() {
        return "I/O error occurred while communicating with a web service.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
