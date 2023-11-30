package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Cliente;

import java.util.List;

public interface ClienteService {
    // Crear
    Cliente guardar(Cliente cliente);

    // Obtiene uno
    Cliente obtenerPorRazonSocialCuit(long id);

    // Obtiene uno
    Cliente obtenerPorId(long id);

    // Obtener todos
    List<Cliente> obtenerTodos();

    // Actualizar
    Cliente actualizar(Cliente cliente, long id);

    // Eliminar
    void eliminar(long id);
}
