package ru.tusur.rbpo.lab1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LabController {
    @GetMapping("/greeting")
    public Map<String, String> greeting() {
        return Map.of("message", "Hello from RBPO lab");
    }

    @GetMapping("/numbers")
    public int[] numbers() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
