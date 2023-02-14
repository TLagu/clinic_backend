package com.sda.clinic.models.company;

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
public class CompanyPhone extends CompanyBase {

    private long companyID; //FK
    private long phoneType; //FK
    private String phone;
    private boolean primary;
}
