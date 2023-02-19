package com.sda.clinic.models.company.medical_history;

import com.sda.clinic.models.company.clinic.ClinicDto;
import com.sda.clinic.models.company.user.UserDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class AppointmentDto {

    private UUID uuid;
    private UserDto patient;
    private UserDto doctor;
    private ClinicDto clinic;

    private String description;
    private String recommendations;

    private SickLeaveDto sickLeave;
    private PrescriptionDto prescription;
    private ReferralDto referral;

    public static AppointmentDto map(Appointment entity) {
        return AppointmentDto.builder()
                .uuid(entity.getUuid())
                .patient(UserDto.map(entity.getPatient()))
                .doctor(UserDto.map(entity.getDoctor()))
                .clinic(ClinicDto.map(entity.getClinic()))
                .description(entity.getDescription())
                .recommendations(entity.getRecommendations())
                .sickLeave(SickLeaveDto.map(entity.getSickLeave()))
                .prescription(PrescriptionDto.map(entity.getPrescription()))
                .referral(ReferralDto.map(entity.getReferral()))
                .build();
    }

}

// "e" or not to "e"
// One-to-one SickLeave
// One-to-one Prescription
// One-to-one Referral