package com.sda.clinic.models.company.medical_history;

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
public class Appointment extends CompanyBase {

    private long patientId;
    private long doctorId;
    private long clinicId;

    private String description;
    private String recommendations;

    private long eSickLeave; //?
    private long ePrescription;
    private long eReferral;
}

// "e" or not to "e"
// One-to-one SickLeave
// One-to-?   Prescription
// One-to-?   Referral