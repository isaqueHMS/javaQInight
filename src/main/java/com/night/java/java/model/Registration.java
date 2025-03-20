package com.night.java.java.model;

import java.time.LocalDate;
import java.util.UUID;

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

    private String status; 
    private LocalDate registrationDate;

 
    public Registration() {
    }

   
    public Registration(UUID code, Event event, Participant participant, String status,
            LocalDate registrationDate) {
        this.code = code;
        this.event = event;
        this.participant = participant;
        this.status = status;
        this.registrationDate = registrationDate;
    }

   
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}