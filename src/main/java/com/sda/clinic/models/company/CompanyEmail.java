package com.sda.clinic.models.company;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "company_emails")
public class CompanyEmail extends CompanyBase {

    private long companyId; //FK

    @Email
    private String email;
//    private boolean primary;
}
