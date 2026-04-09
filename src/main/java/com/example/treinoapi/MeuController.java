package com.example.treinoapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Bem-Vindo")
public class MeuController {

    @GetMapping
    public String BemVIndo() {
        return "Bem Vindo";
    }

    @GetMapping("Teste-RequestParam")
    public long primeiroExemplo (@RequestParam long id)
    {System.out.println("ID recebido: " + id);
        return id;
    }

    @GetMapping ("Teste-PathVariable/id/{id}")
public long SegundoExemplo (@PathVariable("id")long id)
    {System.out.println("ID recebido: " + id);
        return id;
}
@GetMapping ("Teste-RequestHeader")
public String TerceiroExemplo (@RequestHeader("user-agent") String UserAgent, @RequestParam long id){
    System.out.println("User-Agent: " + UserAgent);
        return UserAgent;
}
    @PostMapping
    public String criar(@RequestBody String nome) {
        System.out.println("Recebi: " + nome);
        return "criado: " + nome;
    }
}