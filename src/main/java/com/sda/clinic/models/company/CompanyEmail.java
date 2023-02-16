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
    @JoinColumn(name = "company", referencedColumnName = "id", nullable = false)
    private Company company; //FK
    private String email;
    @Column(name = "is_primary")
    private boolean primary;
}
