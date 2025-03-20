package com.night.java.java.repository;

import com.night.java.java.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, UUID> {
    List<Registration> findByStatus(String status);

    @Query("SELECT r FROM Registration r WHERE r.status = :status")
    List<Registration> findRegistrationsByStatus(@Param("status") String status);

    @Query("SELECT r FROM Registration r WHERE r.event.code = :eventCode AND r.participant.cpf = :participantCPF")
    Optional<Registration> verifyRegistrationEventCode(@Param("eventCode") String eventCode,
            @Param("participantCPF") String participantCPF);
}