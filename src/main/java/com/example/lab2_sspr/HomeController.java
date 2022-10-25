package com.example.lab2_sspr;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/2")
    public String home2() {
        return "Hello";
    }

    @RequestMapping("/3")
    public String home3() {
        return "H";
    }
}
