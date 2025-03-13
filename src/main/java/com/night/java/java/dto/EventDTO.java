package com.night.java.java.dto;

import java.time.LocalDate;

public class EventDTO {
    private Long codigo; // Código do evento
    private String nome; // Nome do evento
    private String descricao; // Descrição do evento
    private LocalDate dataInicio; // Data de início
    private LocalDate dataFim; // Data de término
    private String localizacao; // Localização

    // Construtor vazio
    public EventDTO() {
    }

    // Construtor com todos os atributos
    public EventDTO(Long codigo, String nome, String descricao, LocalDate dataInicio,
            LocalDate dataFim, String localizacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.localizacao = localizacao;
    }

    // Getters e Setters
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    // Método toDTO (converte um modelo Event para EventDTO)
    public static EventDTO toDTO(EventDTO event) {
        return new EventDTO(
                event.getCodigo(),
                event.getNome(),
                event.getDescricao(),
                event.getDataInicio(),
                event.getDataFim(),
                event.getLocalizacao());
    }

    // Método toModel (converte EventDTO para um modelo Event)
    public EventDTO toModel() {
        EventDTO event = new EventDTO(); // Supondo que Event tenha um construtor sem argumentos
        event.setCodigo(this.codigo);
        event.setNome(this.nome);
        event.setDescricao(this.descricao);
        event.setDataInicio(this.dataInicio);
        event.setDataFim(this.dataFim);
        event.setLocalizacao(this.localizacao);
        return event;
    }
}