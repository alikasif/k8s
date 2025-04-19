package com.alikas.k8s.sb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.Instant;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Kasif Spring Boot!";
    }

    @GetMapping("/time")
    public String timeOfTheDay() {
        return "Greetings from Kasif Spring Boot! " + Instant.now(Clock.systemDefaultZone());
    }

}