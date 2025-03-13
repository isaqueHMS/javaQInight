package com.night.java.java.dto;

import java.time.LocalDate;
import java.util.UUID;

import org.apache.logging.log4j.status.StatusData;

public class RegistrationSaveDTO {
    private UUID codigo; // Código único do registro
    private Long codigoEvento; // Código do evento
    private String cpfParticipante; // CPF do participante
    private StatusData status; // Status do registro
    private LocalDate dataRegistro; // Data de registro

    // Construtor vazio
    public RegistrationSaveDTO() {
    }

    // Construtor com todos os atributos
    public RegistrationSaveDTO(UUID codigo, Long codigoEvento, String cpfParticipante, StatusData status,
            LocalDate dataRegistro) {
        this.codigo = codigo;
        this.codigoEvento = codigoEvento;
        this.cpfParticipante = cpfParticipante;
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

    // Método toModel (converte RegistrationSaveDTO para um modelo Registration)
    public RegistrationDTO toModel(EventDTO evento) {
        RegistrationDTO registro = new RegistrationDTO(); // Supondo que Registration tenha um construtor sem argumentos
        registro.setCodigo(this.codigo);
        registro.setEvento(evento); // Associa o evento passado como parâmetro
        registro.setCpfParticipante(this.cpfParticipante);
        registro.setStatus(this.status);
        registro.setDataRegistro(this.dataRegistro);
        return registro;
    }
}