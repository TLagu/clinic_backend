package com.sda.clinic.models.company.clinic;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clinics_phones")
public class ClinicPhone extends CompanyBase {

    @Column(name = "clinic_id")
    private long clinicID; //FK
    private long phoneType; //FK
    private String phoneNo;
//    private boolean primary;
}
