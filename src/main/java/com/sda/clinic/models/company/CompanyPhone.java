package com.sda.clinic.models.company;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="company_phones")
public class CompanyPhone extends CompanyBase {

    @Column(name = "company_id")
    private long companyID; //FK
    private long phoneType; //FK
    private String phoneNo;
//    private boolean primary;
}
