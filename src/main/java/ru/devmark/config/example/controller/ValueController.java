package ru.devmark.config.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/value")
public class ValueController {

    @Value("${very.important.name}")
    private String name;

    @Value("${very.important.number:43}")
    private int number;

    @GetMapping("/hello")
    public String getHelloText() {
        return String.format("Привет, %s!", name);
    }

    @GetMapping("/number")
    public String getImportantNumber() {
        return Integer.toString(number);
    }
}
