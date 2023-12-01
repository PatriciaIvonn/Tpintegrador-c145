package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.TipoProblema;

import java.util.List;

public interface TipoProblemaService {
    // Crear
    TipoProblema guardar(TipoProblema tipoProblema);

    // Obtiene uno
    TipoProblema obtenerPorId(long id);

    // Obtener todos
    List<TipoProblema> obtenerTodos();

    // Actualizar
    TipoProblema actualizar(TipoProblema tipoProblema, long id);

    // Eliminar
    void eliminar(long id);
}
