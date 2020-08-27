package com.fastcampus.javaallinone.project3.mycontect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloWorldController {

    @GetMapping(value = "/api/helloworld")
    public String helloWorld(){
        return "Hello World!!";
    }
}
