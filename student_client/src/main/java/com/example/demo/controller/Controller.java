package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/student")
public class Controller {

    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        String text= "Student name: "+ name;
        log.info(text);
        return text;
    }
}
