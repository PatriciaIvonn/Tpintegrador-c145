package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    // Crear
    Usuario guardar(Usuario usuario);

    // Obtiene uno
    Usuario obtenerPorId(long id);

    // Obtener todos
    List<Usuario> obtenerTodos();

    // Actualizar
    Usuario actualizar(Usuario usuario, long id);

    // Eliminar
    void eliminar(long id);
}
