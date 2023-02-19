package com.sda.clinic.models.company.doctor;

import com.sda.clinic.models.company.CompanyBase;
import com.sda.clinic.models.company.user.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "doctors")
public class Doctor extends CompanyBase {

    @OneToOne
    @JoinColumn(name = "user_uuid")
    private User user;
    private String pzw;
    @Enumerated(EnumType.STRING)
    @Column(name = "academic_title")
    private AcademicTitle academicTitle;
}
