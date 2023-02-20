package com.sda.clinic.controllers;

import com.sda.clinic.models.GetUserResponse;
import com.sda.clinic.models.company.user.UserDto;
import com.sda.clinic.security.services.UserDetailsImpl;
import com.sda.clinic.security.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/getUser")
    public ResponseEntity<GetUserResponse> getCurrentUser(Authentication authentication) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        return ResponseEntity.ok(new GetUserResponse(userDetails.getUsername(), userDetails.getEmail(), roles));
    }

    @GetMapping("/getUserDetail")
    public ResponseEntity<UserDto> getCurrentUserDetails(@RequestParam String username) {
        return ResponseEntity.ok(userService.loadUserByUsername(username));
    }

}
