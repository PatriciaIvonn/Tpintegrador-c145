package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Servicio;
import com.ap.tpintegrado.repository.ServicioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicioServiceImp implements ServicioService {
    private final ServicioRepository servicioRepository;

    // Guarda
    @Override
    public Servicio guardar(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    // Obtiene uno
    @Override
    public Servicio obtenerPorId(long id) {
        return servicioRepository.findById(id).orElseThrow();
    }

    // Obtiene todos
    @Override
    public List<Servicio> obtenerTodos() {
        return servicioRepository.findAll();
    }

    // Actualiza
    @Override
    public Servicio actualizar(Servicio servicio, long id) {
        Servicio servicioDB = servicioRepository.findById(id).orElseThrow();
        servicioDB.setNombre(servicio.getNombre());
        // servicioDB.setActivo(servicio.getActivo());
        servicioDB.setClientes(servicio.getClientes());

        return servicioRepository.save(servicioDB);
    }

    // Elimina
    @Override
    public void eliminar(long id) {
        servicioRepository.deleteById(id);
    }
}
