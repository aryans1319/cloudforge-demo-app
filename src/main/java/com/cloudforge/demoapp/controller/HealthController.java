package com.cloudforge.demoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from CloudForge Demo App to test";
    }
}