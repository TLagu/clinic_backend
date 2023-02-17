package com.sda.clinic.models.company;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PhoneTypeDto {
    private Long id;
    private String type;

    public static PhoneTypeDto map(PhoneType entity) {
        return PhoneTypeDto.builder()
                .id(entity.getId())
                .type(entity.getType())
                .build();
    }
}
