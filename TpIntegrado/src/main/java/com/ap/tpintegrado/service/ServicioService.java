package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Servicio;

import java.util.List;

public interface ServicioService {
    // Crear
    Servicio guardar(Servicio servicio);

    // Leer
    List<Servicio> obtenerTodos();

    // Update
    Servicio actualizar(Servicio servicio, long id);

    // Delete
    void eliminar(long id);

    Servicio obtenerPorId(long id);
}
