package com.github.truejacobg.reminderapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;


public class UserAlreadyRegisteredException extends GlobalException {

    private static final HttpStatusCode STATUS = HttpStatus.BAD_REQUEST;

    public UserAlreadyRegisteredException() {
        super(STATUS, "User with that email and name exists in database!");
    }

    public UserAlreadyRegisteredException(String message) {
        super(STATUS, message);
    }
}
