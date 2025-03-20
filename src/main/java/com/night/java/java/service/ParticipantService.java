package com.night.java.java.service;

import com.night.java.java.model.Participant;
import com.night.java.java.repository.ParticipantRepository;
import java.util.List;
import java.util.Optional;

public class ParticipantService {


    private final ParticipantRepository participantRepository;


    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }


    public Participant registerOrUpdate(Participant participant) {
        return participantRepository.save(participant);
    }


    public List<Participant> findAll() {
        return participantRepository.findAll();
    }

    public Optional<Participant> findByCpf(String cpf) {
        return participantRepository.findByCpf(cpf);
    }

    public Optional<Participant> removeByName(String name) {
        Optional<Participant> participant = participantRepository.findByName(name);
        participant.ifPresent(participantRepository::delete);
        return participant;
    }
}