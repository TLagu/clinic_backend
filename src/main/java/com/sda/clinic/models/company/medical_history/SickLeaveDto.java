package com.sda.clinic.models.company.medical_history;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Builder
public class SickLeaveDto {

    private UUID uuid;
    private String series;
    private String number;
    private String pesel;
    private String patient;
    private InsuredType insuredType;
    private LocalDate birthDayInsured;
    private String postCode;
    private String post;
    private String street;
    private String streetNo;
    private String flatNo;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate hospitalStartDate;
    private LocalDate hospitalEndDate;
    private IndicationType indicationType;
    private IncapacityCode code1;
    private IncapacityCode code2;
    private IncapacityCode code3;
    private IncapacityCode code4;
    private DiseaseTypeDto diseaseType;

    public static SickLeaveDto map(SickLeave entity) {
        return SickLeaveDto.builder()
                .uuid(entity.getUuid())
                .series(entity.getSeries())
                .number(entity.getNumber())
                .pesel(entity.getPesel())
                .patient(entity.getPatient())
                .insuredType(entity.getInsuredType())
                .birthDayInsured(entity.getBirthDayInsured())
                .postCode(entity.getPostCode())
                .post(entity.getPost())
                .street(entity.getStreet())
                .streetNo(entity.getStreetNo())
                .flatNo(entity.getFlatNo())
                .startDate(entity.getStartDate())
                .endDate(entity.getEndDate())
                .hospitalStartDate(entity.getHospitalStartDate())
                .hospitalEndDate(entity.getHospitalEndDate())
                .indicationType(entity.getIndicationType())
                .code1(entity.getCode1())
                .code2(entity.getCode2())
                .code3(entity.getCode3())
                .code4(entity.getCode4())
                .diseaseType(DiseaseTypeDto.map(entity.getDiseaseType()))
                .build();
    }

}

// one-to-one diseaseType
