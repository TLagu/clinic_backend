package com.sda.clinic.models.company.user;

import com.sda.clinic.models.company.role.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
public class UserDto {
    private UUID uuid;
    private UserAppDetailsDto user;
    private String username;
    private String email;
    private Set<Role> roles;

    public static UserDto map(User entity) {
        return UserDto.builder()
                .uuid(entity.getUuid())
                .user(UserAppDetailsDto.map(entity.getUserAppDetails()))
                .username(entity.getUsername())
                .email(entity.getEmail())
                .roles(entity.getRoles())
                .build();
    }

}
