package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Registration;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration,Long> {
    
}