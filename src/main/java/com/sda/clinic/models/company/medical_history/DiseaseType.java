package com.sda.clinic.models.company.medical_history;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "disease_types")
public class DiseaseType extends CompanyBase {

    private String code;
    private String description;
}
