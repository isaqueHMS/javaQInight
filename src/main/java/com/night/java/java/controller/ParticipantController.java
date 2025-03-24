package com.night.java.java.controller;

import com.night.java.java.dto.ParticipantDTO;
import com.night.java.java.service.ParticipantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/participants")
public class ParticipantController {

    private final ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @PostMapping
    public ResponseEntity<ParticipantDTO> register(@RequestBody ParticipantDTO participantDTO) {
        ParticipantDTO savedParticipant = participantService.register(participantDTO);
        return ResponseEntity.ok(savedParticipant);
    }

}