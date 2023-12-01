package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Especialidad;

import java.util.List;

public interface EspecialidadService {
    public Especialidad crearEspecialidad(Especialidad espe);
    public List<Especialidad> listarEspecialidad();
    public Especialidad buscarEspecialidad(Long idEspe);
    public String eliminarEspe (Long idEspe);
}
