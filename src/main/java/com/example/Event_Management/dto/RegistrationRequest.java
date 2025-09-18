package com.example.Event_Management.dto;

import com.example.Event_Management.entity.UserRole;
import lombok.Data;

// Class to hold the necessary data passed from front end - relating to User Registration
@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserRole role;
}
