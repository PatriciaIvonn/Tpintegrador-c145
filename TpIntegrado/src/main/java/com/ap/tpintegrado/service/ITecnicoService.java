package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Tecnico;

import java.util.List;

public interface ITecnicoService {
    public Tecnico crearTecnico(Tecnico tecnico);
    public List<Tecnico> listarTecnico();
    public String borrarTecnico(Long idTecnico);
    public Tecnico traerUnTecnico(Long idTecnico);

}
