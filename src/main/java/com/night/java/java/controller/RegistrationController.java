package com.night.java.java.controller;

import com.night.java.java.dto.ParticipantDTO;
import com.night.java.java.dto.RegistrationDTO;
import com.night.java.java.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registrations") // Alterado de "/api/participants" para "/api/registrations"
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public ResponseEntity<RegistrationDTO> register(@RequestBody ParticipantDTO participantDTO) {
        // Lógica para registrar uma inscrição usando participantDTO
        // Aqui você provavelmente converte participantDTO para Registration e chama o
        // serviço
        RegistrationDTO registration = registrationService.register(participantDTO); // Suposição
        return ResponseEntity.ok(registration);
    }

    // Outros métodos, se houver
}