package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class SoapFaultClientException extends CustomException {
    public SoapFaultClientException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.BAD_GATEWAY;
    }

    @Override
    public String getErrorDescription() {
        return "A SOAP fault occurred during the communication with the service.";
    }
}
