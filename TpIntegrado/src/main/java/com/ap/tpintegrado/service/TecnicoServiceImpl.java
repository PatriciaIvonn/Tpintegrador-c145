package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Tecnico;
import com.ap.tpintegrado.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TecnicoServiceImpl implements ITecnicoService{
    @Autowired
    private TecnicoRepository tecnicoRepo;
    @Override
    public Tecnico crearTecnico(Tecnico tecnicoRec) {
        Tecnico tecnico = tecnicoRepo.save(tecnicoRec);

        return tecnico;
    }

    @Override
    public List<Tecnico> listarTecnico() {

        return  tecnicoRepo.findAll();
    }

    @Override
    public String borrarTecnico(Long idTecnico) {
        tecnicoRepo.findById(idTecnico).orElseThrow(()->
                new RuntimeException("No existe el tecnico "));
        tecnicoRepo.deleteById(idTecnico);
        return "se elimino el tecnico correctamente";
    }

    @Override
    public Tecnico traerUnTecnico(Long idTecnico) {
        Tecnico tecnico = tecnicoRepo.findById(idTecnico).orElseThrow(()->
                new RuntimeException("No existe el tecnico "));
        return tecnico;
    }
}
