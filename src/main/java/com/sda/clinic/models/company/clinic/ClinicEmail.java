package com.sda.clinic.models.company.clinic;

import com.sda.clinic.models.company.CompanyBase;
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
public class ClinicEmail extends CompanyBase {

    private long clinicID; //FK
    private String email;
    private boolean primary;
}
