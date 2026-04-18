package com.example.treinoapi.Repository;

import com.example.treinoapi.Usuario.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
    Optional<Usuario>findByEmail(String email);

    @Transactional
    void deleteByEmail (String email);

    @Transactional
    void deleteById (Integer id);
}
