package com.sda.clinic.models.company;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
