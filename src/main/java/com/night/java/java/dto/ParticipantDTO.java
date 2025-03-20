package com.night.java.java.dto;

import com.night.java.java.model.Participant;

public class ParticipantDTO {
    private String cpf;
    private String nome;
    private String email;
    private String telefone;

    public ParticipantDTO() {
    }

    public ParticipantDTO(String cpf, String nome, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }


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

  
    public static ParticipantDTO toDTO(Participant participant) {
        if (participant == null) {
            return null;
        }
        return new ParticipantDTO(
                participant.getCpf(),
                participant.getNome(),
                participant.getEmail(),
                participant.getTelefone());
    }


    public Participant toModel() {
        Participant participant = new Participant();
        participant.setCpf(this.cpf);
        participant.setNome(this.nome);
        participant.setEmail(this.email);
        participant.setTelefone(this.telefone);
        return participant;
    }
}