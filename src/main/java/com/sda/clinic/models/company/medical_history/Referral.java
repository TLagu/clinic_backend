package com.sda.clinic.models.company.medical_history;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "referrals")
public class Referral extends CompanyBase {

    private String locality;
    private LocalDate referralDate;
    private String clinicName;

    private String patientFullName;
    private int patientAge;
    private String patientAddress;
    private String patientPesel;
    private String patientPhone;

    private String diagnosis;
    private long diseaseType;
    private String purpose;
    private String examinationsPerformed;
}
