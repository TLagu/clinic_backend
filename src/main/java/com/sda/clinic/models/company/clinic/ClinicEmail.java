package com.sda.clinic.models.company.clinic;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clinics_emails")
public class ClinicEmail extends CompanyBase {

    @Column(name = "clinic_id")
    private long clinicID; //FK

    @Email
    private String email;
//    private boolean primary;
}
