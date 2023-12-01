package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.TipoProblema;
import com.ap.tpintegrado.repository.TipoProblemaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoProblemaServiceImp implements TipoProblemaService {
    private final TipoProblemaRepository tipoProblemaRepository;

    // Guarda
    @Override
    public TipoProblema guardar(TipoProblema tipoProblema) {
        return tipoProblemaRepository.save(tipoProblema);
    }

    // Obtiene uno
    @Override
    public TipoProblema obtenerPorId(long id) {
        return tipoProblemaRepository.findById(id).orElseThrow();
    }

    // Obtiene todos
    @Override
    public List<TipoProblema> obtenerTodos() {
        return tipoProblemaRepository.findAll();
    }

    // Actualiza
    @Override
    public TipoProblema actualizar(TipoProblema tipoProblema, long id) {
        TipoProblema tipoProblemaDB = tipoProblemaRepository.findById(id).orElseThrow();
//        clienteDB.setRazonSocial(cliente.getRazonSocial());
//        clienteDB.setCuit(cliente.getCuit());
//        clienteDB.setMail(cliente.getMail());
        // clienteDB.setActivo(cliente.getAActivo());

        return tipoProblemaRepository.save(tipoProblemaDB);
    }

    // Elimina
    @Override
    public void eliminar(long id) {
        tipoProblemaRepository.deleteById(id);
    }
}
