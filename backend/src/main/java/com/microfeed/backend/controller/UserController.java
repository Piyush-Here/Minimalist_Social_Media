package com.microfeed.backend.controller;

import com.microfeed.backend.domain.User;
import com.microfeed.backend.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/sample")
    public User sampleUser() {
        return userService.getSampleUser();
    }
}