package com.sda.clinic.models.company;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
public abstract class CompanyBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //PK
    private UUID uuid; //UK

    private @Setter long createdBy;
    private @Setter LocalDateTime createdOn;
    private @Setter long updatedBy;
    private @Setter LocalDateTime updatedOn;

    private Status status;
}
