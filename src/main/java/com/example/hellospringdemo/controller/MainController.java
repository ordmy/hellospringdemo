package com.example.hellospringdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class MainController {
    @GetMapping("/")
    public String index() {
        return "Hello, SpringBoot!";
    }
}
