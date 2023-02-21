package com.sda.clinic.models.company;

import lombok.*;

@Getter
@Setter
@Builder
public class PhoneTypeDto {
    private Long id;
    private String type;

    public static PhoneTypeDto map(PhoneType entity) {
        return PhoneTypeDto.builder()
                .type(entity.getType())
                .build();
    }
}
