package com.sda.clinic.security.services;

import com.sda.clinic.models.company.clinic.Clinic;
import com.sda.clinic.models.company.user.User;
import com.sda.clinic.models.company.user.UserDto;
import com.sda.clinic.repository.ClinicRepository;
import com.sda.clinic.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ClinicRepository clinicRepository;

    @Transactional
    public UserDto loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null || username.equals("")) {
            throw new UsernameNotFoundException("User Not Found.");
        }
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found."));

        return UserDto.map(user);
    }

    public void modify(UserDto request, PasswordEncoder encoder) {
        final User user = userRepository
                .findByUuid(UUID.fromString(request.getUuid()))
                .orElseThrow(() -> new IllegalArgumentException("Nie znaleziono użytkownika!!!"));
        final Clinic clinic = clinicRepository
                .findByUuid(UUID.fromString(request.getClinic()))
                .orElseThrow(() -> new IllegalArgumentException("Nie znaleziono użytkownika!!!"));
        if (request.getPassword() != null && !request.getPassword().isEmpty()) {
            user.setPassword(encoder.encode(request.getPassword()));
        }
        user.setEmail(request.getEmail());
        user.getUserAppDetails().setFirstName(request.getUserAppDetails().getFirstName());
        user.getUserAppDetails().setSecondName(request.getUserAppDetails().getSecondName());
        user.getUserAppDetails().setLastName(request.getUserAppDetails().getLastName());
        user.getUserAppDetails().setPesel(request.getUserAppDetails().getPesel());
        user.getUserAppDetails().setIdNumber(request.getUserAppDetails().getIdNumber());
        user.getUserAppDetails().setBirthDay(request.getUserAppDetails().getBirthDay());
        user.getUserAppDetails().setNip(request.getUserAppDetails().getNip());
        user.setClinic(clinic);
        userRepository.saveAndFlush(user);
    }
}
