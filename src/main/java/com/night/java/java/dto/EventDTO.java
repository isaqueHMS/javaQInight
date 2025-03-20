package com.night.java.java.dto;

import java.time.LocalDate;

import com.night.java.java.model.Event; 

public class EventDTO {
    private Long codigo;
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String localizacao;

   
    public EventDTO() {
    }

  
    public EventDTO(Long codigo, String nome, String descricao, LocalDate dataInicio,
            LocalDate dataFim, String localizacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.localizacao = localizacao;
    }

   
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

    public static EventDTO toDTO(Event event) {
        if (event == null) {
            return null;
        }

        return new EventDTO(
                event.getCode(),
                event.getName(),
                event.getDescription(),
                event.getStartDate(),
                event.getEndDate(),
                event.getLocation());
    }

    public Event toModel() {
        return new Event(
                this.codigo, 
                this.nome, 
                this.descricao,
                this.dataInicio, 
                this.dataFim, 
                this.localizacao, 
                null 
        );
    }

}