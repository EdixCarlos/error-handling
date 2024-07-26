package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class HttpMessageNotReadableException extends CustomException {
    public HttpMessageNotReadableException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public String getErrorDescription() {
        return "HTTP message is not readable.";
    }
    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
