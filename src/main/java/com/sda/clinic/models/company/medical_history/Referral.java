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
    @Column(name = "referral_date")
    private LocalDate referralDate;
    @Column(name = "clinic_name")
    private String clinicName;

    @Column(name = "patient_full_name")
    private String patientFullName;
    @Column(name = "patient_age")
    private int patientAge;
    @Column(name = "patient_address")
    private String patientAddress;
    @Column(name = "patient_pesel")
    private String patientPesel;
    @Column(name = "patient_phone")
    private String patientPhone;

    private String diagnosis;
    @OneToOne
    @JoinColumn(name = "disease_type")
    private DiseaseType diseaseType;
    private String purpose;
    @Column(name = "examinations_performed")
    private String examinationsPerformed;
}
