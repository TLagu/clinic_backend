package com.sda.clinic.models.company.clinic;

import com.sda.clinic.models.company.CompanyBase;
import com.sda.clinic.models.company.PhoneType;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clinics_phones")
public class ClinicPhone extends CompanyBase {

    @ManyToOne
    @JoinColumn(name = "clinic", referencedColumnName = "uuid", nullable = false)
    private Clinic clinic; //FK
    @OneToOne
    @JoinColumn(name = "phone_type")
    private PhoneType phoneType; //FK
    private String phone;
    @Column (name = "is_primary")
    private boolean primary;
}
