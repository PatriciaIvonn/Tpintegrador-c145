package com.ap.tpintegrado.service;

import java.util.List;

public interface BaseInterface <T, t>{
    // Crear
    T guardar(T t);

    // Obtiene uno
    T obtenerPorId(long id);

    // Obtener todos
    List<T> obtenerTodos();

    // Actualizar
    T actualizar(T t, long id);

    // Eliminar
    void eliminar(long id);
}
