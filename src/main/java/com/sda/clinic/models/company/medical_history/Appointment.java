package com.sda.clinic.models.company.medical_history;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "appointments")
public class Appointment extends CompanyBase {

    private long patientId;
    private long doctorId;
    private long clinicId;

    private String description;
    private String recommendations;

    private long sickLeave;
    private long prescription;
    private long referral;
}

// "e" or not to "e"
// One-to-one SickLeave
// One-to-one Prescription
// One-to-one Referral