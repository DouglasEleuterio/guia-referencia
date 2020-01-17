package com.douglas.guiareferencia;

import java.util.Optional;

public interface UsuarioService {

    /**
     * Busca e retorna um usuario dado o nome do usuario
     * @param usuario
     * @return Optional<Usuario>
     */
    Optional<Usuario> buscarPorUsuario (String usuario);
}
