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

public class Doctor extends CompanyBase{

    private long userId;
    private String pzw;
    private AcademicTitle academicTitle;
}
