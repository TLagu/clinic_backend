package com.sda.clinic.models.company;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@NoArgsConstructor
public abstract class CompanyBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    private @Setter UUID createdBy;
    private @Setter LocalDateTime createdOn;
    private @Setter UUID updatedBy;
    private @Setter LocalDateTime updatedOn;
    @Enumerated(EnumType.STRING)
    private Status status;

}
