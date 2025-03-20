package com.night.java.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home() {
        return "Bem-vindo à API de Eventos!";
    }

    @GetMapping("/status")
    public String status() {
        return "O sistema está funcionando corretamente!";
    }
}
