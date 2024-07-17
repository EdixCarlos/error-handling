package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class HttpTimeoutException extends CustomException {
    public HttpTimeoutException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.GATEWAY_TIMEOUT;
    }

    @Override
    public String getErrorDescription() {
        return "The HTTP request timed out.";
    }
}
