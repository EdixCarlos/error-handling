package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class HttpRequestMethodNotSupportedException extends CustomException {
    public HttpRequestMethodNotSupportedException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.METHOD_NOT_ALLOWED;
    }

    @Override
    public String getErrorDescription() {
        return "The HTTP request method is not supported.";
    }
}
