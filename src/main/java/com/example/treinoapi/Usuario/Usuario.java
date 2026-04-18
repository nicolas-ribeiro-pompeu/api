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

    @Column (name = "telefone")
    private String telefone;

    public Usuario (){}

    public Usuario(String nome, String email, Integer id, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    public String getNome() { return nome; }

    public String getEmail() { return email; }

    public Integer getId() { return id;}

    public String getTelefone() {return telefone;}

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setTelefone (String telefone){
        this.telefone = telefone;
    }

}
