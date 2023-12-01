package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Tecnico;

import java.util.List;

public interface TecnicoService {
    public Tecnico crearTecnico(Tecnico tec);
    public List<Tecnico> traerTecnicos();
    public String eliminarTecnico(Long idTecnico);
    public Tecnico buscarTecnico(Long idTecnico);

}
