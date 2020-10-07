package ru.devmark.config.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.devmark.config.example.config.VeryImportantConfig;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/grouped")
public class GroupedValueController {

    private final VeryImportantConfig veryImportantConfig;

    public GroupedValueController(VeryImportantConfig veryImportantConfig) {
        this.veryImportantConfig = veryImportantConfig;
    }

    @GetMapping("/hello")
    public String getHelloText() {
        return String.format("Привет, %s!", veryImportantConfig.getName());
    }

    @GetMapping("/number")
    public String getImportantNumber() {
        return Integer.toString(veryImportantConfig.getNumber());
    }

    @GetMapping("/days")
    public List<String> getWorkDays() {
        return veryImportantConfig.getDays();
    }

    @GetMapping("/holidays")
    public List<LocalDate> getHolidays() {
        return veryImportantConfig.getHolidays();
    }
}
