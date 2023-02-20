package com.sda.clinic.security.services;

import com.sda.clinic.models.company.user.User;
import com.sda.clinic.models.company.user.UserDto;
import com.sda.clinic.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserDto loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null || username.equals("")) {
            throw new UsernameNotFoundException("User Not Found.");
        }
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found."));

        return UserDto.map(user);
    }

}
