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
public class PhoneType extends CompanyBase{

    private String type;
}

//One-to-many CompanyPhone
//One-to-many clinic.ClinicPhone
