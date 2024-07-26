package org.aje.errorhandling.advice;

import org.aje.errorhandling.dto.ErrorResponse;
import org.aje.errorhandling.exceptions.BadRequestException;
import org.aje.errorhandling.exceptions.CustomException;
import org.aje.errorhandling.exceptions.TemplateException;
import org.aje.errorhandling.exceptions.TimestampException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GlobalExceptionHandlerTest {

    private GlobalExceptionHandler globalExceptionHandler;
    private WebRequest webRequest;

    @BeforeEach
    void setUp() {
        globalExceptionHandler = new GlobalExceptionHandler();
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRequestURI("/test/exception/badRequest");
        webRequest = new ServletWebRequest(request);
    }

    @Test
    void handleCustomExceptionReturnsCorrectErrorResponse() {
        CustomException customException = new TemplateException("Custom error");
        ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.handleCustomException(customException, webRequest);

        assertNotNull(responseEntity.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
        assertEquals("Custom error", responseEntity.getBody().getError());
        assertEquals("uri=/test/exception/badRequest", responseEntity.getBody().getPath());
    }

    @Test
    void handleCustomExceptionSetsCurrentTimestamp() {
        TimestampException customException = new TimestampException("");
        ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.handleCustomException(customException, webRequest);
        LocalDateTime timestampBeforeCall = LocalDateTime.now().minusSeconds(1);
        LocalDateTime timestampAfterCall = LocalDateTime.now().plusSeconds(1);

        assertNotNull(responseEntity.getBody().getTimestamp());
        assertEquals(HttpStatus.REQUEST_TIMEOUT, responseEntity.getStatusCode());
        assertEquals("Error related to timestamp processing.", responseEntity.getBody().getError());
        assertTrue(responseEntity.getBody().getTimestamp().isAfter(timestampBeforeCall) && responseEntity.getBody().getTimestamp().isBefore(timestampAfterCall));
    }

    @Test
    void handleExceptionWithoutCustomMessageReturnsGenericErrorResponse() {
        BadRequestException exception = new BadRequestException("Generic error");
        ResponseEntity<ErrorResponse> responseEntity = globalExceptionHandler.handleCustomException(exception, webRequest);

        assertNotNull(responseEntity.getBody());
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
        assertEquals("Generic error", responseEntity.getBody().getMessage());
        assertEquals("uri=/test/exception/badRequest", responseEntity.getBody().getPath());
    }
}