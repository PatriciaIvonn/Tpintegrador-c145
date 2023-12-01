package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Especialidad;
import com.ap.tpintegrado.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadServiceImpl implements EspecialidadService{
     @Autowired
    EspecialidadRepository espeRepo;
    @Override
    public Especialidad crearEspecialidad(Especialidad espe) {
        return espeRepo.save(espe);
    }

    @Override
    public List<Especialidad> listarEspecialidad() {
        return espeRepo.findAll();
    }

    @Override
    public Especialidad buscarEspecialidad(Long idEspe) {
        return espeRepo.findById(idEspe).orElseThrow(()-> new RuntimeException("No se encontro la especialidad buscada"));
    }

    @Override
    public String eliminarEspe(Long idEspe) {
        //verifico que exista id
        espeRepo.findById(idEspe).orElseThrow(()-> new RuntimeException("No existe la especialidad"));
        espeRepo.deleteById(idEspe);
        return  "Se elimino correctamente la especialidad";
    }
}
