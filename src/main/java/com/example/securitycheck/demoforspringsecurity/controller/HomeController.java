package com.example.securitycheck.demoforspringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String login(){
        return "login" ;
    }

    @GetMapping("/")
    public String home(){
        return "home" ;
    }
}
