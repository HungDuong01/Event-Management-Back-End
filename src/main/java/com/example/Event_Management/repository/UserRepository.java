package com.example.Event_Management.repository;

import com.example.Event_Management.entity.User;
import com.example.Event_Management.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{
    List<User> findByEmail(String email);
    List<User> findByRole(UserRole role);
    Boolean existsByEmail(String email);
}
