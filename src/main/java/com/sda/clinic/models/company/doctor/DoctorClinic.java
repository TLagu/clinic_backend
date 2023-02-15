package com.sda.clinic.models.company.doctor;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "doctors_clinics")
public class DoctorClinic extends CompanyBase {

    @Column(name = "doctor_id")
    private long doctorId;
    private long clinicId;

}

//One-to-many clinic.Clinic

