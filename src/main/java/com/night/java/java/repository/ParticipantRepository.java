package com.night.java.java.repository;

import com.night.java.java.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

    Optional<Participant> findByName(String name);

    Optional<Participant> findByCpf(String cpf);
}