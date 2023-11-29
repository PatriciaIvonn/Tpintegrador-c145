package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Cliente;

import java.util.List;

public interface ClienteService {
    // Create
    Cliente guardar(Cliente cliente);

    // Read
    List<Cliente> obtenerTodos();

    // Update
    Cliente actualizar(Cliente cliente, long id);

    // Delete
    void eliminar(long id);
}
