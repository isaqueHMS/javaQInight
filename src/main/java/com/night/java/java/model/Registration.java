package com.night.java.java.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Registration {
    @Id
    @GeneratedValue
    private UUID code;

    private String status;

    @ManyToOne
    @JoinColumn(name = "event_code")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "participant_cpf")
    private Participant participant;

    private LocalDate registrationDate;

    public Registration() {
    }

    public UUID getCode() {
        return code;
    }

    public void setCode(UUID code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}