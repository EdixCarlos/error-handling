package org.aje.errorhandling.exceptions;

import org.springframework.http.HttpStatus;

public class TransactionSystemException extends CustomException {
    public TransactionSystemException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @Override
    public String getErrorDescription() {
        return "A system error occurred while processing the transaction.";
    }
}
