package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Tecnico;
import com.ap.tpintegrado.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TecnicoServiceImpl implements TecnicoService {
   @Autowired
    TecnicoRepository tecRepo;
    @Override
    public Tecnico crearTecnico(Tecnico tec) {

        return tecRepo.save(tec);
    }

    @Override
    public List<Tecnico> traerTecnicos() {
        return tecRepo.findAll();
    }

    @Override
    public String eliminarTecnico(Long idTecnico) {
        tecRepo.findById(idTecnico).orElseThrow(()-> new RuntimeException("No existe el tecnico "));
       tecRepo.deleteById(idTecnico);
        return "Se elimino el tecnico Correctamente";
    }

    @Override
    public Tecnico buscarTecnico(Long idTecnico) {
        return  tecRepo.findById(idTecnico).orElseThrow(()-> new RuntimeException("No existe el tecnico "));
    }
}
