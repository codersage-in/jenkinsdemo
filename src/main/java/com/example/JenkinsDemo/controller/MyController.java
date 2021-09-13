package com.example.JenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to the world of jenkins!!!!";
    }
}
