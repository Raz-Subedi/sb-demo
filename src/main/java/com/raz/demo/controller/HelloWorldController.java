package com.raz.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    public String goodMorning() {
        return "Good Morning";
    }
    public String goodMornin() {
        return "Good Morning";
    }
}
