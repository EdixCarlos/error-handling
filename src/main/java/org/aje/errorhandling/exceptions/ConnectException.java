package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class ConnectException extends CustomException {
    public ConnectException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.SERVICE_UNAVAILABLE;
    }

    @Override
    public String getErrorDescription() {
        return "Failed to connect to the server.";
    }
}
