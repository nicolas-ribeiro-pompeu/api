package com.example.treinoapi.bussines;

import com.example.treinoapi.Repository.UsuarioRepository;
import com.example.treinoapi.Usuario.Usuario;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
    private UsuarioRepository repository;

    public UsuarioService (UsuarioRepository repository){
        this.repository = repository;
    }

    public void salvarUsuario (Usuario usuario ){
      repository.saveAndFlush(usuario);
    }

    public Usuario buscarEmail (String email){
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email nao encontrado"));
    }
    public void deletarUsuarioPorId (Integer id){
         repository.deleteById(id);
    }

    public void deletarUsuarioPorEmail (String email) {repository.deleteByEmail(email);}

    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));

        if (usuario.getNome() != null) {
            usuarioEntity.setNome(usuario.getNome());
        }
        if (usuario.getEmail() != null) {
            usuarioEntity.setEmail(usuario.getEmail());
        }
        if (usuario.getTelefone() != null) {
            usuarioEntity.setTelefone (usuario.getTelefone());
        }

        repository.saveAndFlush(usuarioEntity);
    }
}
