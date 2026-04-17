package com.bridgelabz.quantitymeasurement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Quantity Measurement Backend is running successfully";
    }
}