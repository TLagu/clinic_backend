package com.sda.clinic.models.company.medical_history;

import com.sda.clinic.models.company.CompanyBase;
import com.sda.clinic.models.company.clinic.Clinic;
import com.sda.clinic.models.company.user.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "appointments")
public class Appointment extends CompanyBase {

    @OneToOne
    @JoinColumn(name = "patient")
    private User patient;
    @OneToOne
    @JoinColumn(name = "doctor")
    private User doctor;
    @OneToOne
    @JoinColumn(name = "clinic")
    private Clinic clinic;

    private String description;
    private String recommendations;

    @OneToOne
    @JoinColumn(name = "sick_leave")
    private SickLeave sickLeave;
    @OneToOne
    @JoinColumn(name = "prescription")
    private Prescription prescription;
    @OneToOne
    @JoinColumn(name = "referral")
    private Referral referral;
}