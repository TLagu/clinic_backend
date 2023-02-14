package com.sda.clinic.models.company.doctor;

import com.sda.clinic.models.company.CompanyBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class DoctorClinic extends CompanyBase {

    private long doctorId;
    private long clinicId;

}

//One-to-many clinic.Clinic

