package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class MaxUploadSizeExceededException extends CustomException {
    public MaxUploadSizeExceededException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.PAYLOAD_TOO_LARGE;
    }

    @Override
    public String getErrorDescription() {
        return "The uploaded file size exceeds the maximum allowed limit.";
    }
}
