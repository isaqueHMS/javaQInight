package com.night.java.java.service;

import com.night.java.java.dto.ParticipantDTO;
import com.night.java.java.model.Participant;
import com.night.java.java.repository.ParticipantRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
@Service
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


    public Object save(ParticipantDTO participantDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }


    public ParticipantDTO register(ParticipantDTO participantDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }
}