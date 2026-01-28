package com.microfeed.backend.controller;

import com.microfeed.backend.dto.CreateUserRequest;
import com.microfeed.backend.dto.UserResponse;
import com.microfeed.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/sample")
    public UserResponse sampleUser() {
        return userService.getSampleUser();
    }

    @PostMapping
    public UserResponse createUser(@Valid @RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }
}
