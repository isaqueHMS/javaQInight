package com.night.java.java.service;

import com.night.java.java.dto.ParticipantDTO;
import com.night.java.java.dto.RegistrationDTO;
import com.night.java.java.model.Registration;
import com.night.java.java.repository.RegistrationRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public Registration registerOrUpdate(Registration registration) {
        return registrationRepository.save(registration);
    }

    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    public Optional<Registration> findById(UUID id) {
        return registrationRepository.findById(id);
    }

    public List<Registration> findByStatus(String status) {
        return registrationRepository.findByStatus(status);
    }

    public Optional<Registration> verifyRegisterInEvent(Long eventCode, String participantCPF) {
        return registrationRepository.verifyRegistrationEventCode(eventCode.toString(), participantCPF);
    }

    public RegistrationDTO register(ParticipantDTO participantDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }
}