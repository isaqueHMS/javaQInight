package com.night.java.java.dto;

public class ParticipantDTO {
    private String cpf; // CPF do participante
    private String nome; // Nome do participante
    private String email; // Email do participante
    private String telefone; // Telefone do participante
    private ParticipantDTO participante; // Participante aninhado para composição

    // Construtor vazio
    public ParticipantDTO() {
    }

    // Construtor com todos os atributos
    public ParticipantDTO(String cpf, String nome, String email, String telefone, ParticipantDTO participante) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.participante = participante;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ParticipantDTO getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipantDTO participante) {
        this.participante = participante;
    }

    // Método toDTO (converte um modelo Participant para ParticipantDTO)
    public static ParticipantDTO toDTO(ParticipantDTO participant) {
        return new ParticipantDTO(
                participant.getCpf(),
                participant.getNome(),
                participant.getEmail(),
                participant.getTelefone(),
                participant.getParticipante() != null ? toDTO(participant.getParticipante()) : null);
    }

    // Método toModel (converte ParticipantDTO para um modelo Participant)
    public ParticipantDTO toModel() {
        ParticipantDTO participant = new ParticipantDTO(); // Supondo que Participant tenha um construtor sem argumentos
        participant.setCpf(this.cpf);
        participant.setNome(this.nome);
        participant.setEmail(this.email);
        participant.setTelefone(this.telefone);
        if (this.participante != null) {
            participant.setParticipante(this.participante.toModel());
        }
        return participant;
    }
}