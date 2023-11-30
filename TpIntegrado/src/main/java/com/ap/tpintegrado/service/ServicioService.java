package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Servicio;

import java.util.List;

public interface ServicioService {
    // Crear
    Servicio guardar(Servicio servicio);

    // Obtiene uno
    Servicio obtenerPorId(long id);

    // Obtener todos
    List<Servicio> obtenerTodos();

    // Actualizar
    Servicio actualizar(Servicio servicio, long id);

    // Eliminar
    void eliminar(long id);
}
