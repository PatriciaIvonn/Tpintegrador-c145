package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Cliente;
import com.ap.tpintegrado.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImp implements ClienteService {
    private final ClienteRepository clienteRepository;

    // Guarda
    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Obtiene uno
    @Override
    public Cliente obtenerPorId(long id) {
        return clienteRepository.findById(id).orElseThrow();
    }

    // Obtiene por razon social y cuit
    @Override
    public Cliente obtenerPorRazonSocialCuit(long id) {
        return clienteRepository.findById(id).orElseThrow();
    }

    // Obtiene todos
    @Override
    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }

    // Actualiza
    @Override
    public Cliente actualizar(Cliente cliente, long id) {
        Cliente clienteDB = clienteRepository.findById(id).orElseThrow();
        clienteDB.setRazonSocial(cliente.getRazonSocial());
        clienteDB.setCuit(cliente.getCuit());
        clienteDB.setMail(cliente.getMail());
        // clienteDB.setActivo(cliente.getAActivo());

        return clienteRepository.save(clienteDB);
    }

    // Elimina
    @Override
    public void eliminar(long id) {
        clienteRepository.deleteById(id);
    }
}
