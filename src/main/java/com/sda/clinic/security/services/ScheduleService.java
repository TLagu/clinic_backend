package com.sda.clinic.security.services;

import com.sda.clinic.models.company.ScheduleDto;
import com.sda.clinic.models.company.doctor.DoctorCalendar;
import com.sda.clinic.models.company.doctor.DoctorCalendarDto;
import com.sda.clinic.models.company.user.User;
import com.sda.clinic.repository.ScheduleRepository;
import com.sda.clinic.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;
    private final UserRepository userRepository;

    public ScheduleDto getScheduleByDate(String date, String userUuid) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime = LocalDate.parse(date, formatter).atStartOfDay();
        LocalDateTime dateFrom = dateTime.truncatedTo(ChronoUnit.DAYS);
        LocalDateTime dateTo = dateFrom.plusDays(1);
        if (userUuid == null || userUuid.isBlank()) {
            return new ScheduleDto(new ArrayList<>(), dateFrom.toString());
        } else {
            UUID uuid = UUID.fromString(userUuid);
            User user = userRepository.findByUuid(uuid)
                    .orElseThrow(() -> new IllegalArgumentException("Nie znaleziono użytkownika!!!"));
            Set<DoctorCalendar> doctorCalendar = scheduleRepository.findByDateRange(dateFrom, dateTo, user);
            return new ScheduleDto(doctorCalendar.stream()
                    .map(DoctorCalendarDto::map)
                    .collect(Collectors.toList()), dateFrom.toString());
        }
    }

}
