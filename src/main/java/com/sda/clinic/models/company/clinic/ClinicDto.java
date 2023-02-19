package com.sda.clinic.models.company.clinic;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
public class ClinicDto {

    private UUID uuid; //UK
    //private Company company; //FK
    private UUID companyUuid;
    private String province;
    private String district;
    private String community;
    private String locality;
    private String street;
    private String streetNo;
    private String flatNo;
    private String postCode;
    private String post;
    private String clinicName;
    private String description;

    private Set<ClinicEmailDto> emails;
    private Set<ClinicPhoneDto> phones;

    public static ClinicDto map(Clinic entity) {
        return ClinicDto.builder()
                .uuid(entity.getUuid())
                .companyUuid(entity.getCompany().getUuid())
                .province(entity.getProvince())
                .district(entity.getDistrict())
                .community(entity.getCommunity())
                .locality(entity.getLocality())
                .street(entity.getStreet())
                .streetNo(entity.getStreetNo())
                .flatNo(entity.getFlatNo())
                .postCode(entity.getPostCode())
                .post(entity.getPost())
                .clinicName(entity.getClinicName())
                .description(entity.getDescription())
                .emails((entity.getEmails() == null) ? null : entity.getEmails().stream()
                        .map(ClinicEmailDto::map)
                        .collect(Collectors.toSet()))
                .phones((entity.getPhones() == null) ? null : entity.getPhones().stream()
                        .map(ClinicPhoneDto::map)
                        .collect(Collectors.toSet()))
                .build();
    }

}
