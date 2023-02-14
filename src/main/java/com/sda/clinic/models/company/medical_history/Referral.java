package com.sda.clinic.models.company.medical_history;

import com.sda.clinic.models.company.CompanyBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Referral extends CompanyBase {

    private String locality;
    private LocalDate referralDate;
    private String clinicName;

    private String patient;
    private int patientAge;
    private String patientAdress;
    private String patientPesel;
    private String patientPhone;

    private String diagnosis;
    private long diseaseType;
    private String purpose;
    private String researchDone;
}
