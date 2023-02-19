package com.sda.clinic.models.company.clinic;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clinics_emails")
public class ClinicEmail extends CompanyBase {

    @ManyToOne
    @JoinColumn(name = "clinic", referencedColumnName = "uuid", nullable = false)
    private Clinic clinic; //FK
    private String email;
    @Column(name = "is_primary")
    private boolean primary;
}
