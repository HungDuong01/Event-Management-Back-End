package com.example.Event_Management.controller;

import com.example.Event_Management.dto.RegistrationRequest;
import com.example.Event_Management.entity.User;
import com.example.Event_Management.service.UserRegistrationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class UserRegistrationController {
    private final UserRegistrationService userRegistrationService;

    @PostMapping("/register")
    public ResponseEntity<User>registerUser(@Valid @RequestBody RegistrationRequest request){
        User newUser = userRegistrationService.register(request);
        return ResponseEntity.ok().body(newUser);
    }
}
