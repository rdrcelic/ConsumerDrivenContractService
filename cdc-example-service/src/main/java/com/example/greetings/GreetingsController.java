package com.example.greetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Greeting resource controller
 *
 * @author rdrcelic
 * @since 24/02/17
 */
@RestController
public class GreetingsController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
