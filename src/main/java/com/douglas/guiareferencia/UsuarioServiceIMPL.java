package com.douglas.guiareferencia;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UsuarioServiceIMPL implements UsuarioService{

    @Autowired UsuarioRepository usuarioRepository;


    public Optional<Usuario> buscarPorUsuario(String usuario) {
        return Optional.ofNullable(this.usuarioRepository.findByUsuario(usuario));
    }
}
