package com.raz.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping
    public String goodMorning() {
        return "Good Morning";
    }
    @GetMapping
    public String goodMorningg() {
        return "Good Morning";
    }

}
