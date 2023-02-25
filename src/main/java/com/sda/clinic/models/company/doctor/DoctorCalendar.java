package com.sda.clinic.models.company.doctor;

import com.sda.clinic.models.company.CompanyBase;
import com.sda.clinic.models.company.medical_history.Appointment;
import com.sda.clinic.models.company.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "doctors_calendars")
public class DoctorCalendar extends CompanyBase {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_uuid")
    private User user;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "appointment")
    private Appointment appointment;

}
