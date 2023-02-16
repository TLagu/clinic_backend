package com.sda.clinic.models.company.clinic;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ClinicPhoneDto {
    private ClinicDto clinic; //FK
    private Long phoneType; //FK
    private String phone;
    private boolean primary;

    public static ClinicPhoneDto map(ClinicPhone entity) {
        return ClinicPhoneDto.builder()
                .phoneType(entity.getPhoneType().getId())
                .phone(entity.getPhone())
                .primary(entity.isPrimary())
                .build();
    }

}
