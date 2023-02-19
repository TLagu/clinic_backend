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
@Table(name = "sick_leaves")
public class SickLeave extends CompanyBase {

    private String series;
    @Column(name = "patent_number")
    private String number;
    private String pesel;
    private String patient;

    @Enumerated(EnumType.STRING)
    private InsuredType insuredType;
    private LocalDate birthDayInsured;
    private String postCode;
    private String post;
    private String street;
    private String streetNo;
    private String flatNo;

    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate hospitalStartDate;
    private LocalDate hospitalEndDate;

    @Enumerated(EnumType.STRING)
    private IndicationType indicationType;

    @Enumerated(EnumType.STRING)
    private IncapacityCode code1;
    private IncapacityCode code2;
    private IncapacityCode code3;
    private IncapacityCode code4;
    @OneToOne
    @JoinColumn(name = "disease_type")
    private DiseaseType diseaseType;

}

// one-to-one diseaseType
