package com.github.truejacobg.remiderapp.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {GlobalException.class})
    public ResponseEntity<Object> handleRequestException(GlobalException exception) {
        return new ResponseEntity<>(exception.getMessage(), exception.getStatusCode());
    }
}
