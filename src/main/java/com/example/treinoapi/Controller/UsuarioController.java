package com.example.treinoapi.Controller;

import com.example.treinoapi.Repository.UsuarioRepository;
import com.example.treinoapi.Usuario.Usuario;
import com.example.treinoapi.bussines.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService service;
    public UsuarioController (UsuarioService service){
        this.service =service;
    }

    @PostMapping
    public ResponseEntity<Void> salvarUsuario (@RequestBody Usuario usuario){
        service.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Usuario> buscarEmail (@RequestParam String email){
        Usuario usuario = service.buscarEmail(email);
        return ResponseEntity.ok(usuario);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuarioPorId (@PathVariable Integer id, @RequestBody Usuario usuario){
      service.atualizarUsuarioPorId(id, usuario);
      return ResponseEntity.ok(usuario);

    }
    @DeleteMapping( "/{id}")
    public ResponseEntity<Usuario> deletarUsuarioPorId (@PathVariable Integer id){
         service.deletarUsuarioPorId(id);
         return ResponseEntity.ok().build();
    }
    @DeleteMapping
    public ResponseEntity<Usuario> deletarUsuarioPorEmail (@RequestParam String email){
      service.deletarUsuarioPorEmail(email);
         return ResponseEntity.ok().build();
    }
}

