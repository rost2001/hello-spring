package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "<h1>Hello World!</h1>";
    }

}

