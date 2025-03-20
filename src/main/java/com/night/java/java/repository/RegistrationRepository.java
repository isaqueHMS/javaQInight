package com.night.java.java.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.night.java.java.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, UUID> {


List<Registration> findByStatus(String status);


    Optional<Registration> verifyRegistrationEventCode(String eventCode);
}