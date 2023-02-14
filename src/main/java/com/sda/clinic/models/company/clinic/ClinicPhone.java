package com.sda.clinic.models.company.clinic;

import com.sda.clinic.models.company.CompanyBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class ClinicPhone extends CompanyBase {

    private long clinicID; //FK
    private long phoneType; //FK
    private String phone;
    private boolean primary;
}
