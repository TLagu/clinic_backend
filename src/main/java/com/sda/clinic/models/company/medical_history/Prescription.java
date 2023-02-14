package com.sda.clinic.models.company.medical_history;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Prescription extends CompanyBase {

    private String code;
    private String accessCode;
    private LocalDate issueDate;
    private String patient;
    private String doctor;
    private String pzw;
    private String phone;
    private LocalDateTime controlDate;
    private int count;
}

// one-to-many PrescriptionDetails