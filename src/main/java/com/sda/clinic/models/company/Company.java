package com.sda.clinic.models.company;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="company")
public class Company extends CompanyBase {

    private String fullName;
    private String shortName;

    private String nip;
    private String regon;
    private String krs;
    private String accountNumber;
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
// One-to-Many CompanyEmail
// One-to-Many CompanyPhone

// One-to-Many clinic.Clinic
