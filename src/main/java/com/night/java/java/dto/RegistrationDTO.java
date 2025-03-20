package com.night.java.java.dto;

import com.night.java.java.model.Registration;
import java.time.LocalDate;
import java.util.UUID;

public class RegistrationDTO {
    private UUID codigo; 
    private EventDTO evento;
    private String cpfParticipante;
    private String nomeParticipante; 
    private String status;
    private LocalDate dataRegistro; 


    public RegistrationDTO() {
    }

   
    public RegistrationDTO(UUID codigo, EventDTO evento, String cpfParticipante, String nomeParticipante,
            String status, LocalDate dataRegistro) {
        this.codigo = codigo;
        this.evento = evento;
        this.cpfParticipante = cpfParticipante;
        this.nomeParticipante = nomeParticipante;
        this.status = status;
        this.dataRegistro = dataRegistro;
    }

  
    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public EventDTO getEvento() {
        return evento;
    }

    public void setEvento(EventDTO evento) {
        this.evento = evento;
    }

    public String getCpfParticipante() {
        return cpfParticipante;
    }

    public void setCpfParticipante(String cpfParticipante) {
        this.cpfParticipante = cpfParticipante;
    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
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

   
    public static RegistrationDTO toDTO(Registration registration) {
        if (registration == null) {
            return null;
        }
        return new RegistrationDTO(
                registration.getCode(),
                EventDTO.toDTO(registration.getEvent()),
                registration.getParticipant() != null ? registration.getParticipant().getCpf() : null,
                registration.getParticipant() != null ? registration.getParticipant().getName() : null,
                registration.getStatus(),
                registration.getRegistrationDate());
    }

  
    public Registration toModel() {
        Registration registration = new Registration();
        registration.setCode(this.codigo);
        registration.setEvent(this.evento != null ? this.evento.toModel() : null);
     
        registration.setStatus(this.status);
        registration.setRegistrationDate(this.dataRegistro);
        return registration;
    }
}