package com.night.java.java.dto;

import java.time.LocalDate;
import java.util.UUID;

import org.apache.logging.log4j.status.StatusData;

public class RegistrationDTO {
    private UUID codigo; // Código único do registro
    private EventDTO evento; // Evento associado
    private String cpfParticipante; // CPF do participante
    private String nomeParticipante; // Nome do participante
    private StatusData status; // Status do registro
    private LocalDate dataRegistro; // Data de registro

    // Construtor vazio
    public RegistrationDTO() {
    }

    // Construtor com todos os atributos
    public RegistrationDTO(UUID codigo, EventDTO evento, String cpfParticipante, String nomeParticipante,
            StatusData status, LocalDate dataRegistro) {
        this.codigo = codigo;
        this.evento = evento;
        this.cpfParticipante = cpfParticipante;
        this.nomeParticipante = nomeParticipante;
        this.status = status;
        this.dataRegistro = dataRegistro;
    }

    // Getters e Setters
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

    public StatusData getStatus() {
        return status;
    }

    public void setStatus(StatusData status) {
        this.status = status;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    // Método toDTO (converte um modelo Registration para RegistrationDTO)
    public static RegistrationDTO toDTO(RegistrationDTO registration) {
        return new RegistrationDTO(
                registration.getCodigo(),
                registration.getEvento(),
                registration.getCpfParticipante(),
                registration.getNomeParticipante(),
                registration.getStatus(),
                registration.getDataRegistro());
    }

    // Método toModel (converte RegistrationDTO para um modelo Registration)
    public RegistrationDTO toModel() {
        RegistrationDTO registration = new RegistrationDTO(); // Supondo que Registration tenha um construtor sem
                                                              // argumentos
        registration.setCodigo(this.codigo);
        registration.setEvento(this.evento);
        registration.setCpfParticipante(this.cpfParticipante);
        registration.setNomeParticipante(this.nomeParticipante);
        registration.setStatus(this.status);
        registration.setDataRegistro(this.dataRegistro);
        return registration;
    }
}