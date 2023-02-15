package com.sda.clinic.models.company.doctor;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "doctors")
public class Doctor extends CompanyBase{

    @Column(name = "user_id")
    private long userId;
    private String pzw;

    @Enumerated(EnumType.STRING)
    private AcademicTitle academicTitle;
}
