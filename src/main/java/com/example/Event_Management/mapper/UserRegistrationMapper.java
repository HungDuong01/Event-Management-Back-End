package com.example.Event_Management.mapper;

import com.example.Event_Management.dto.RegistrationRequest;
import com.example.Event_Management.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRegistrationMapper {

    // Function to map the data to User entity
    public User mapToEntity(User user,RegistrationRequest registrationRequest) {
        if(user == null) {
            user = new User();
        }
        setData(user,registrationRequest);
        return user;
    }

    // Function to save and create based on the necessary data for new user
    public void setData(User user,RegistrationRequest registrationRequest) {
        user.setFirstName(registrationRequest.getFirstName());
        user.setLastName(registrationRequest.getLastName());
        user.setEmail(registrationRequest.getEmail());
        user.setPassword(registrationRequest.getPassword());
        user.setRole(registrationRequest.getRole());
    }
}
