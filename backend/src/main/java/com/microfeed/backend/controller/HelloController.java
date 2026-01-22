package com.microfeed.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microfeed.backend.service.HealthService;

@RestController
public class HelloController {

    private final HealthService healthService;

    public HelloController(HealthService healthService) {
        this.healthService = healthService;
    }
    @GetMapping("/health")
    public String health() {
        return healthService.status();
    }
}
