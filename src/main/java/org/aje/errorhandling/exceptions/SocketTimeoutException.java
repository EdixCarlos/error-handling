package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class SocketTimeoutException extends CustomException {
    public SocketTimeoutException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.GATEWAY_TIMEOUT;
    }

    @Override
    public String getErrorDescription() {
        return "The socket timed out while trying to read or write data.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
