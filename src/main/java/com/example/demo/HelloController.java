package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List; 

@RestController
class HelloController { 

    @GetMapping("/hello")
    public String getmsg() { 
        return "Helo from Spring Boot!"; 
    }
}
