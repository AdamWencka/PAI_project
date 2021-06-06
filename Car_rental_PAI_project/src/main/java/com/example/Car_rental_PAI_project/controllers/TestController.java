package com.example.Car_rental_PAI_project.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/klient")
    @PreAuthorize("hasRole('KLIENT') or hasRole('PRACOWNIK') or hasRole('MANAGER')")
    public String userAccess() {
        return "Klient Content.";
    }

    @GetMapping("/pracownik")
    @PreAuthorize("hasRole('PRACOWNIK')")
    public String moderatorAccess() {
        return "Pracownik Content.";
    }

    @GetMapping("/manager")
    @PreAuthorize("hasRole('MANAGER')")
    public String adminAccess() {
        return "Manager Content.";
    }
}
