package com.sda.clinic.models.company.doctor;

import com.sda.clinic.models.company.CompanyBase;
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

    @Column(name = "user_id")
    private long userId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long appointmentId;

}

//one-to-one medical_history.Appointment
