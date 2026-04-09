package com.example.treinoapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class MeuController {

    @GetMapping
    public String nome() {
        return "testando";
    }

    @GetMapping("/ola")
    public String ola() {
        return "Olá";
    }

    @GetMapping ("/Bemvindo")
public String bemvindo (){
        return "bem vindo";
}
    @PostMapping
    public String criar(@RequestBody String nome) {
        System.out.println("Recebi: " + nome);
        return "criado: " + nome;
    }
}