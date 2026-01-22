package com.microfeed.backend.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService{
    public String status(){
        return " Backend is running";
    }
}