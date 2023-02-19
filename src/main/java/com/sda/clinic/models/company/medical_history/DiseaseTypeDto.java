package com.sda.clinic.models.company.medical_history;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class DiseaseTypeDto {

    private UUID uuid;
    private String code;
    private String description;

    public static DiseaseTypeDto map(DiseaseType entity) {
        return DiseaseTypeDto.builder()
                .uuid(entity.getUuid())
                .code(entity.getCode())
                .description(entity.getDescription())
                .build();
    }

}
