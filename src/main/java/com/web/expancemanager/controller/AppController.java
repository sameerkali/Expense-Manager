package com.web.expancemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }
    
    @GetMapping("/login.html")
    public String customLoginPage() {
    	return "login";
    }
    
    @GetMapping("/signup")
    public String signup() {
    	return "SignupPage";
    }
}
