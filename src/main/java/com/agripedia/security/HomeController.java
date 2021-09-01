package com.agripedia.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Home Application";
    }

    @GetMapping("/user")
    public String user() {
        return "User Application";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin Application";
    }
}
