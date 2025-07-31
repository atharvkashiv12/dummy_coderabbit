package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List; // ❌ unused import

@RestController
class HelloController { // ❌ should probably be public

    @GetMapping("/hello")
    public String getmsg() { // ❌ bad naming
        return "Helo from Spring Boot!"; // ❌ typo in "Hello"
    }
}
