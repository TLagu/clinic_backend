package com.sda.clinic.models.company;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "company_emails")
public class CompanyEmail extends CompanyBase {

    @ManyToOne
    @JoinColumn(name = "company", referencedColumnName = "uuid", nullable = false)
    private Company company;
    private String email;
    @Column(name = "is_primary")
    private boolean primary;
}
