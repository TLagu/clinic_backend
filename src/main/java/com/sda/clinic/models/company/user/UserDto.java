package com.sda.clinic.models.company.user;

import com.sda.clinic.models.company.clinic.ClinicEmail;
import com.sda.clinic.models.company.clinic.ClinicEmailDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class UserDto {
    private UUID uuid;
    private String username;
    private String email;

    public static UserDto map(User entity) {
        return UserDto.builder()
                .uuid(entity.getUuid())
                .username(entity.getUsername())
                .email(entity.getEmail())
                .build();
    }

}
