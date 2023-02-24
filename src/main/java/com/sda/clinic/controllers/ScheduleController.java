package com.sda.clinic.controllers;

import com.sda.clinic.models.company.ScheduleDto;
import com.sda.clinic.security.services.ScheduleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/schedule")
@AllArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/getScheduleByDay")
//    @PreAuthorize("hasRole('ROLE_DOCTOR') or hasRole('ROLE_PATIENT')")
    public ResponseEntity<ScheduleDto> getScheduleByDay(@RequestParam String date, @RequestParam String userUuid) {
        return ResponseEntity.ok(scheduleService.getScheduleByDate(date, userUuid));
    }
}
