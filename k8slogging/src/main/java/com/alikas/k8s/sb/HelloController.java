package com.alikas.k8s.sb;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.Instant;

@RestController
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @GetMapping("/")
    public String index() {
        logger.info("got the message on root path...");
        return "Greetings from Kasif Spring Boot!";
    }

    @GetMapping("/time")
    public String timeOfTheDay() {
        logger.info("got the message on time path...");
        return "Greetings from Kasif Spring Boot! " + Instant.now(Clock.systemDefaultZone());
    }

}