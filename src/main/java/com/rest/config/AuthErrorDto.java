package com.rest.config;

public class AuthErrorDto {

    private String message;

    public AuthErrorDto() {
        super();
    }

    public AuthErrorDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}