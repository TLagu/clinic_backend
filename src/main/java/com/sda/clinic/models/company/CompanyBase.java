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
    private UUID uuid; //UK
    private @Setter long createdBy = 1;
    private @Setter LocalDateTime createdOn;
    private @Setter long updatedBy = 1;
    private @Setter LocalDateTime updatedOn;
    @Enumerated(EnumType.STRING)
    private Status status;

}
