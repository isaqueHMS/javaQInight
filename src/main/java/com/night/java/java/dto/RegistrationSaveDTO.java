package com.night.java.java.dto;

import com.night.java.java.model.Event;
import com.night.java.java.model.Participant;
import com.night.java.java.model.Registration;
import java.time.LocalDate;
import java.util.UUID;

public class RegistrationSaveDTO {
    private UUID codigo;
    private Long codigoEvento;
    private String cpfParticipante;
    private String status;
    private LocalDate dataRegistro;

    public RegistrationSaveDTO() {
    }

    public RegistrationSaveDTO(UUID codigo, Long codigoEvento, String cpfParticipante, String status,
            LocalDate dataRegistro) {
        this.codigo = codigo;
        this.codigoEvento = codigoEvento;
        this.cpfParticipante = cpfParticipante;
        this.status = status;
        this.dataRegistro = dataRegistro;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public Long getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(Long codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public String getCpfParticipante() {
        return cpfParticipante;
    }

    public void setCpfParticipante(String cpfParticipante) {
        this.cpfParticipante = cpfParticipante;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Registration toModel() {
        Registration registration = new Registration();
        registration.setCode(this.codigo);

        // Configurar o Event manualmente
        if (this.codigoEvento != null) {
            Event event = new Event();
            event.setCode(this.codigoEvento);
            registration.setEvent(event);
        }

        // Configurar o Participant manualmente
        if (this.cpfParticipante != null) {
            Participant participant = new Participant();
            participant.setCpf(this.cpfParticipante);
            registration.setParticipant(participant);
        }

        registration.setStatus(this.status);
        registration.setRegistrationDate(this.dataRegistro);
        return registration;
    }
}