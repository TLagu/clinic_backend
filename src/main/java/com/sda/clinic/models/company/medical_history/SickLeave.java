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
public class SickLeave extends CompanyBase {

    private String series;
    private String number;

    //Patient data
    private String pesel;
    private String firstName;
    private String lastName;
    private InsuredType insuredType;
    private LocalDate birthDayInsured;
    private String postCode;
    private String post;
    private String street;
    private String streetNo;
    private String flatNo;

    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate startDateHospital;
    private LocalDate endDateHospital;

    private IndicationType indicationType;
    private IncapacityCode code1;
    private IncapacityCode code2;
    private IncapacityCode code3;
    private IncapacityCode code4;
    private long diseaseType;

}

// one-to-one diseaseType
