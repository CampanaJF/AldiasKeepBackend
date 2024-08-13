package com.inkwell.aldias_keep.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.valueOf;

@ControllerAdvice
@Configuration
@AllArgsConstructor
public class RestErrorHandler extends ResponseEntityExceptionHandler {

    private final ObjectMapper objectMapper;

    @ExceptionHandler(value = {Throwable.class})
    protected ResponseEntity<Object> handleConflict(RuntimeException exception, WebRequest request)
            throws JsonProcessingException {
        var error = HttpErrorResponse
                .builder()
                .code(500)
                .message(exception.getMessage())
                .build();

        return handleExceptionInternal(
                exception,
                objectMapper.writeValueAsString(error),
                new HttpHeaders(),
                INTERNAL_SERVER_ERROR,
                request);

    }

    @ExceptionHandler(value = {Exception.class})
    protected ResponseEntity<Object> handleConflict(Exception exception, WebRequest request)
            throws JsonProcessingException {
        var error = HttpErrorResponse
                .builder()
                .code(400)
                .message(exception.getMessage())
                .build();

        return handleExceptionInternal(
                exception,
                objectMapper.writeValueAsString(error),
                new HttpHeaders(),
                BAD_REQUEST,
                request);
    }

    @ExceptionHandler(value = {BaseException.class})
    protected ResponseEntity<Object> handleConflict(BaseException exception, WebRequest request)
            throws JsonProcessingException {
        var error = HttpErrorResponse
                .builder()
                .code(exception.getCode())
                .message(exception.getMessage())
                .build();

        return handleExceptionInternal(
                exception,
                objectMapper.writeValueAsString(error),
                new HttpHeaders(),
                valueOf(exception.getCode()),
                request);
    }
}
