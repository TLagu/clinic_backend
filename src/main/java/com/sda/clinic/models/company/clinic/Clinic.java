package com.sda.clinic.models.company.clinic;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clinics")
public class Clinic extends CompanyBase {

    @Column(name = "company_id")
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
