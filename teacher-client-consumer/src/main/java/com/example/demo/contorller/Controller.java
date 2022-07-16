package com.example.demo.contorller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/teacher")
@Slf4j
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getData")
    public String getData(){
        String text=restTemplate.getForObject("http://student-client/student/rasta", String.class);
        log.info(text);
        return text;
    }
}
