package com.sda.clinic.models.company.medical_history;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "prescriptions")
public class Prescription extends CompanyBase {

    private String code;
    private String accessCode;
    private LocalDate issueDate;
    private String patient;
    private String doctor;
    private String pzw;
    private String phone;
    private LocalDateTime controlDate;
    private String number;
    private String drug;
    private LocalDate realizationDate;
    private String packagingType;
    private String dosage;
}