package com.night.java.java.controller;

import com.night.java.java.dto.ParticipantDTO;
import com.night.java.java.model.Participant;
import com.night.java.java.service.ParticipantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/participants")
public class RegistrationController {

    private final ParticipantService participantService;

  
    public RegistrationController(ParticipantService participantService) {
        this.participantService = participantService;
    }

 
    @PostMapping
    public ResponseEntity<ParticipantDTO> register(@RequestBody ParticipantDTO participantDTO) {
        Participant participant = participantDTO.toModel();
        Participant savedParticipant = participantService.registerOrUpdate(participant);
        return ResponseEntity.ok(ParticipantDTO.toDTO(savedParticipant));
    }


    @GetMapping
    public ResponseEntity<List<ParticipantDTO>> findAll() {
        List<ParticipantDTO> participants = participantService.findAll()
                .stream()
                .map(ParticipantDTO::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(participants);
    }

   
    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<ParticipantDTO> findByCpf(@PathVariable String cpf) {
        Optional<Participant> participant = participantService.findByCpf(cpf);
        return participant.map(p -> ResponseEntity.ok(ParticipantDTO.toDTO(p)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    
    @DeleteMapping("/name/{name}")
    public ResponseEntity<ParticipantDTO> removeByName(@PathVariable String name) {
        Optional<Participant> participant = participantService.removeByName(name);
        return participant.map(p -> ResponseEntity.ok(ParticipantDTO.toDTO(p)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}