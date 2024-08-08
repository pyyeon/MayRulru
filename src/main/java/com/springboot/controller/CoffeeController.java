package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/coffee")
@RestController
public class CoffeeController {
    @GetMapping
    public String getCoffee(){
        return "Hello Coffee World!";
    }
}
