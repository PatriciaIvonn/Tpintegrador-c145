package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Rol;

import java.util.List;

public interface RolService {
    // Crear
    Rol guardar(Rol rol);

    // Obtiene uno
    Rol obtenerPorId(long id);

    // Obtener todos
    List<Rol> obtenerTodos();

    // Actualizar
    Rol actualizar(Rol rol, long id);

    // Eliminar
    void eliminar(long id);
}
