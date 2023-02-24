package com.sda.clinic.models.company.doctor;

import com.sda.clinic.models.company.medical_history.AppointmentDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
public class DoctorCalendarDto {

    private UUID uuid;
    private UUID userUuid;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private AppointmentDto appointment;

    public static DoctorCalendarDto map(DoctorCalendar entity) {
        return DoctorCalendarDto.builder()
                .uuid(entity.getUuid())
                .userUuid(entity.getUser().getUuid())
                .startTime(entity.getStartTime())
                .endTime(entity.getEndTime())
                .appointment(entity.getAppointment() == null ? null : AppointmentDto.map(entity.getAppointment()))
                .build();
    }

}

//one-to-one medical_history.Appointment
