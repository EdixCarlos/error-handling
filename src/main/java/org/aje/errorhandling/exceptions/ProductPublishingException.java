package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class ProductPublishingException extends CustomException {
    public ProductPublishingException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.FORBIDDEN;
    }

    @Override
    public String getErrorDescription() {
        return "Maximum retries reached for publishing product.";
    }

    @Override
    public String getErrorDescription(String message) {
        return message;
    }
}
