package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * Handles HTTP GET requests to the root URL and returns a greeting message.
     *
     * @return a plain text greeting.
     */
    @GetMapping("/")
    public String hello() {
        return "Hello, CodeRabbit! code change";
    }
}
