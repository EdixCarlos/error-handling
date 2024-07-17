package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class UnknownHostException extends CustomException {
    public UnknownHostException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_GATEWAY;
    }

    @Override
    public String getErrorDescription() {
        return "The IP address of the host could not be determined.";
    }
}
