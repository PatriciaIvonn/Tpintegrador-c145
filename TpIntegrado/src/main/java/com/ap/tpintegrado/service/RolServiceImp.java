package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Rol;
import com.ap.tpintegrado.repository.RolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RolServiceImp implements RolService {
    private final RolRepository rolRepository;

    // Guarda
    @Override
    public Rol guardar(Rol rol) {
        return rolRepository.save(rol);
    }

    // Obtiene uno
    @Override
    public Rol obtenerPorId(long id) {
        return rolRepository.findById(id).orElseThrow();
    }

    // Obtiene todos
    @Override
    public List<Rol> obtenerTodos() {
        return rolRepository.findAll();
    }

    // Actualiza
    @Override
    public Rol actualizar(Rol cliente, long id) {
        Rol rolDB = rolRepository.findById(id).orElseThrow();
//        clienteDB.setRazonSocial(cliente.getRazonSocial());
//        clienteDB.setCuit(cliente.getCuit());
//        clienteDB.setMail(cliente.getMail());
        // clienteDB.setActivo(cliente.getAActivo());

        return rolRepository.save(rolDB);
    }

    // Elimina
    @Override
    public void eliminar(long id) {
        rolRepository.deleteById(id);
    }
}
