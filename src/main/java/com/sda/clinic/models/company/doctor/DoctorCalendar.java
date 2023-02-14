package com.sda.clinic.models.company.doctor;

import com.sda.clinic.models.company.CompanyBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class DoctorCalendar extends CompanyBase {

    private long userId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long appointmentId;

}

//one-to-one medical_history.Appointment
