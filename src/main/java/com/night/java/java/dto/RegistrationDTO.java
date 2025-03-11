package main.java.com.night.java.java.dto;

import java.time.LocalDate;
import java.util.UUID;

public class RegistrationDTO {
    private UUID codigo; // Código único do registro
    private Event evento; // Evento associado
    private String cpfParticipante; // CPF do participante
    private String nomeParticipante; // Nome do participante
    private Status status; // Status do registro
    private LocalDate dataRegistro; // Data de registro

    // Construtor vazio
    public RegistrationDTO() {
    }

    // Construtor com todos os atributos
    public RegistrationDTO(UUID codigo, Event evento, String cpfParticipante, String nomeParticipante,
            Status status, LocalDate dataRegistro) {
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

    public Event getEvento() {
        return evento;
    }

    public void setEvento(Event evento) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    // Método toDTO (converte um modelo Registration para RegistrationDTO)
    public static RegistrationDTO toDTO(Registration registration) {
        return new RegistrationDTO(
                registration.getCodigo(),
                registration.getEvento(),
                registration.getCpfParticipante(),
                registration.getNomeParticipante(),
                registration.getStatus(),
                registration.getDataRegistro());
    }

    // Método toModel (converte RegistrationDTO para um modelo Registration)
    public Registration toModel() {
        Registration registration = new Registration(); // Supondo que Registration tenha um construtor sem argumentos
        registration.setCodigo(this.codigo);
        registration.setEvento(this.evento);
        registration.setCpfParticipante(this.cpfParticipante);
        registration.setNomeParticipante(this.nomeParticipante);
        registration.setStatus(this.status);
        registration.setDataRegistro(this.dataRegistro);
        return registration;
    }
}