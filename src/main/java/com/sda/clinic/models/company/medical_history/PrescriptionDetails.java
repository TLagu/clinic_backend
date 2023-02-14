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

public class PrescriptionDetails extends CompanyBase {

    private long prescriptionId;
    private String code;
    private int occurence;
    private String number;
    private String drug;
    private LocalDate realizationDate;
    private String packagingType;
    private String dosage;
}

