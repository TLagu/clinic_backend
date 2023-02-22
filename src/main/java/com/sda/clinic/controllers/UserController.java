package com.sda.clinic.controllers;

import com.sda.clinic.models.GetUserResponse;
import com.sda.clinic.models.company.user.UserDto;
import com.sda.clinic.security.services.UserDetailsImpl;
import com.sda.clinic.security.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    private final PasswordEncoder encoder;

    @GetMapping("/getUser")
    public ResponseEntity<GetUserResponse> getCurrentUser(Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        return ResponseEntity.ok(new GetUserResponse(userDetails.getUsername(), userDetails.getEmail(), roles));
    }

    @GetMapping("/user")
    public ResponseEntity<UserDto> getCurrentUserDetails(@RequestParam String username) {
        return ResponseEntity.ok(userService.loadUserByUsername(username));
    }

    @PutMapping("/user")
    public ResponseEntity<?> modify(@RequestBody UserDto request) {
        userService.modify(request, encoder);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
