package com.sda.clinic.models.company.clinic;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class ClinicPhoneDto {
    private UUID uuid;
    private UUID clinicUuid; //FK
    private UUID phoneTypeUuid; //FK
    private String phone;
    private boolean primary;

    public static ClinicPhoneDto map(ClinicPhone entity) {
        return ClinicPhoneDto.builder()
                .uuid(entity.getUuid())
                .clinicUuid(entity.getClinic().getUuid())
                .phoneTypeUuid(entity.getPhoneType().getUuid())
                .phone(entity.getPhone())
                .primary(entity.isPrimary())
                .build();
    }

}
