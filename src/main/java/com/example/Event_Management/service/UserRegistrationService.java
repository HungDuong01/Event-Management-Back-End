package com.example.Event_Management.service;

import com.example.Event_Management.dto.RegistrationRequest;
import com.example.Event_Management.entity.User;
import com.example.Event_Management.mapper.UserRegistrationMapper;
import com.example.Event_Management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserRegistrationService {
    private final UserRepository userRepository;
    private final UserRegistrationMapper userInfoMapper;
    // Function to register the user
    public User register(RegistrationRequest registrationRequest){
        if(userRepository.existsByEmail(registrationRequest.getEmail())){ // Only allow one email for one account
            log.info("User with email {} already exists", registrationRequest.getEmail());
            throw new RuntimeException("User with this email already exists");
        }
        var user = userInfoMapper.mapToEntity(null,registrationRequest); // Create a new user using the info passed from front end
        return userRepository.save(user);
    }

}
