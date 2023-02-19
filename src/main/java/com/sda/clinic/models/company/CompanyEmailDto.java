package com.sda.clinic.models.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class CompanyEmailDto extends CompanyBase {
    private UUID uuid;
    private UUID companyUuid; //FK
    private String email;
    private boolean primary;

    public static CompanyEmailDto map(CompanyEmail entity) {
        return CompanyEmailDto.builder()
                .uuid(entity.getUuid())
                .companyUuid(entity.getCompany().getUuid())
                .email(entity.getEmail())
                .primary(entity.isPrimary())
                .build();
    }
}
