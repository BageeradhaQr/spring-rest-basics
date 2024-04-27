package com.practice.spring.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("welcome")
    public String welcome(){
        return "Welcome to Curex Pharma Inda Portal";
    }
}
