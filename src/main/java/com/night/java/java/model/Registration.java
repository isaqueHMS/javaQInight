package com.night.java.java.model;

import java.time.LocalDate;
import java.util.UUID;

import org.apache.logging.log4j.status.StatusData;

import jakarta.persistence.*;

@Entity
public class Registration {

    @Id
    private UUID code;

    @ManyToOne
    @JoinColumn(name = "event_code")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "participant_cpf")
    private Participant participant;

    private StatusData status;
    private LocalDate registrationDate;

    // Construtor vazio (necessário para JPA)
    public Registration() {
    }

    // Construtor com todos os atributos
    public Registration(UUID code, Event event, Participant participant, StatusData status,
            LocalDate registrationDate) {
        this.code = code;
        this.event = event;
        this.participant = participant;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    // Getters e Setters
    public UUID getCode() {
        return code;
    }

    public void setCode(UUID code) {
        this.code = code;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public StatusData getStatus() {
        return status;
    }

    public void setStatus(StatusData status) {
        this.status = status;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}