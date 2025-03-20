package com.raz.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    public String goodMorning(){
        return "Good Morning";
    }

    public String goodEvening(){
        return "Good Evening";
    }

    public String Thursday(){
        return "Today is thursday";
    }
    public String Friday(){
        return "Today is Friday";
    }
    public String Saturday(){
        return "Today is Saturday";
    }
    public String Sunday(){
        return "Today is Sunday";
    }
    public String Monday(){
        return "Today is Monday";
    }
    public String Tuesday(){
        return "Today is Tuesday";
    }
    public String Wednesday(){
        return "Today is Wednesday";
    }
    public String Hello(){
        return "Today is thursday";
    }
}
