package ru.tusur.rbpo.lab1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/observatory")
public class LabController {

    @GetMapping("/description")
    public String description() {
        return "A reference API for Solar System observations.";
    }

    @GetMapping("/planet-counts")
    public PlanetCounts planetCounts() {
        var rockyPlanets = List.of("Mercury", "Venus", "Earth", "Mars");
        var giantPlanets = List.of("Jupiter", "Saturn", "Uranus", "Neptune");
        return new PlanetCounts(rockyPlanets.size(), giantPlanets.size());
    }

    public record PlanetCounts(int rocky, int giants) {}
}
