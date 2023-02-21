package com.sda.clinic.models.company;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "phone_types")
public class PhoneType extends CompanyBase {

    @Column(name = "phone_type")
    private String type;
}