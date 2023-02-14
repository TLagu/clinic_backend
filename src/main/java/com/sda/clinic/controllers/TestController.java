package com.sda.clinic.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_SECRETARY') or hasRole('ROLE_PATIENT')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }

    @GetMapping("/secretary")
    @PreAuthorize("hasRole('ROLE_SECRETARY')")
    public String secretaryAccess() {
        return "Secretary Board.";
    }

    @GetMapping("/patient")
    @PreAuthorize("hasRole('ROLE_PATIENT')")
    public String patientAccess() {
        return "Patient Board.";
    }
}
