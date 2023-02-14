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
public class PhoneType extends CompanyBase{

    private String type;
}

//One-to-many CompanyPhone
//One-to-many clinic.ClinicPhone
