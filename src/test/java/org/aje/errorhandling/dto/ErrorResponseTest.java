package org.aje.errorhandling.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

class ErrorResponseTest {

    @Test
    void errorResponseHoldsCorrectTimestamp() {
        LocalDateTime now = LocalDateTime.now();
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setTimestamp(now);

        assertEquals(now, errorResponse.getTimestamp(), "Timestamp should match the set value");
    }

    @Test
    void errorResponseHoldsCorrectStatus() {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(404);

        assertEquals(404, errorResponse.getStatus(), "Status should match the set value");
    }

    @Test
    void errorResponseHoldsCorrectError() {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setError("Not Found");

        assertEquals("Not Found", errorResponse.getError(), "Error should match the set value");
    }

    @Test
    void errorResponseHoldsCorrectMessage() {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("The requested resource was not found");

        assertEquals("The requested resource was not found", errorResponse.getMessage(), "Message should match the set value");
    }

    @Test
    void errorResponseHoldsCorrectPath() {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setPath("/non-existent-path");

        assertEquals("/non-existent-path", errorResponse.getPath(), "Path should match the set value");
    }
}