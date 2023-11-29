package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Servicio;
import com.ap.tpintegrado.repository.ServicioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicioServiceImp implements ServicioService {
    //
    private final ServicioRepository servicioRepository;

    @Override
    public Servicio guardar(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @Override
    public List<Servicio> obtenerTodos() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio actualizar(Servicio servicio, long id) {
        Servicio servicioDB = servicioRepository.findById(id).orElseThrow();

        servicioDB.setNombre(servicio.getNombre());

        servicioDB.setClientes(servicio.getClientes());

        return servicioRepository.save(servicioDB);
    }

    @Override
    public void eliminar(long id) {
        servicioRepository.deleteById(id);
    }

    @Override
    public Servicio obtenerPorId(long id) {
        return servicioRepository.findById(id).orElseThrow();
    }
}
