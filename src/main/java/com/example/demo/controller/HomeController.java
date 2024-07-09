package com.example.demo.controller;

import com.example.demo.domain.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Hello from Azure App Service (in the staging slot)!";
    }

    @GetMapping("/hello")
    public Message StartMessage(@RequestParam(value="name", defaultValue = "World") String name) {
        return new Message(String.format("Hello %s!", name));
    }

    @GetMapping("/goodbye")
    public Message endMessage(@RequestParam(value = "nmae", defaultValue = "world") String name ) {
        return new Message(String.format("See you next time %s!!", name));
    }
}
