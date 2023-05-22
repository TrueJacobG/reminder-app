package com.github.truejacobg.reminderapp.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

@Getter
@Setter
@NoArgsConstructor
public class GlobalException extends RuntimeException {
    private HttpStatusCode statusCode;
    private String message;

    public GlobalException(HttpStatusCode statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
        this.message = message;
    }
}
