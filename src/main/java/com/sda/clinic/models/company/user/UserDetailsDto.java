package com.sda.clinic.models.company.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Builder
public class UserDetailsDto {
    private UserDto user;
    private UUID uuid;
    private String firstName;
    private String secondName;
    private String lastName;
    private String pesel;
    private String idNumber;
    private LocalDate birthDay;
    private String nip;

    public UserDetailsDto map(UserDetails entity) {
        return UserDetailsDto.builder()
                .user(UserDto.map(entity.getUser()))
                .uuid(entity.getUuid())
                .firstName(entity.getFirstName())
                .secondName(entity.getSecondName())
                .lastName(entity.getLastName())
                .pesel(entity.getPesel())
                .idNumber(entity.getIdNumber())
                .birthDay(entity.getBirthDay())
                .nip(entity.getNip())
                .build();
    }

}
