package com.night.java.java.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cpf;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)
    private List<Registration> registrations;

    // Construtor vazio (necessário para JPA)
    public Participant() {
    }

    // Construtor com todos os atributos
    public Participant(Long cpf, String name, String email, String phone, List<Registration> registrations) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.registrations = registrations;
    }

    // Getters e Setters
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
}