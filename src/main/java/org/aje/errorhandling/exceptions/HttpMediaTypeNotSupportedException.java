package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class HttpMediaTypeNotSupportedException extends CustomException {
    public HttpMediaTypeNotSupportedException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.UNSUPPORTED_MEDIA_TYPE;
    }

    @Override
    public String getErrorDescription() {
        return "The media type is not supported.";
    }
}
