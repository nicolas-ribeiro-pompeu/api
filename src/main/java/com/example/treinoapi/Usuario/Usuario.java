package com.example.treinoapi.Usuario;
import jakarta.persistence.*;
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "email")
    private String email;

    public Usuario (){}

    public Usuario(String nome, String email, Integer id){
        this.nome = nome;
        this.email = email;
    }
    public String getNome() { return nome; }

    public String getEmail() { return email; }

    public Integer getId() { return id;}

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setEmail (String email){
        this.email = email;
    }

}
