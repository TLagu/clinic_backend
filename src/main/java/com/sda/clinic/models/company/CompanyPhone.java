package com.sda.clinic.models.company;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "company_phones")
public class CompanyPhone extends CompanyBase {

    @ManyToOne
    @JoinColumn(name = "company", referencedColumnName = "uuid", nullable = false)
    private Company company;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phone_type")
    private PhoneType phoneType;
    private String phone;
    @Column(name = "is_primary")
    private boolean primary;
}
