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
public class Clinic extends CompanyBase {

    private long companyID; //FK

    private String province;
    private String district;
    private String community;
    private String locality;
    private String street;
    private String streetNo;
    private String flatNo;
    private String postCode;
    private String post;

    private float longitude;
    private float latitude;
}

// One-to-Many ClinicEmail
// One-to-Many ClinicPhone
