package com.sda.clinic.models.company.role;

import com.sda.clinic.models.company.CompanyBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "roles")
public class Role extends CompanyBase {

    @Enumerated(EnumType.STRING)
    @Column(name = "role_name", length = 20)
    private ERole name;

}
