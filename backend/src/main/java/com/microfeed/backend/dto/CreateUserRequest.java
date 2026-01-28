package com.microfeed.backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CreateUserRequest {

    @NotBlank
    private String username;

    @Email
    @NotBlank
    private String email;

    public CreateUserRequest() {
        // Required by Spring
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
