package com.ap.tpintegrado.service;

import com.example.tpspringboot.entity.Mascota;
import com.example.tpspringboot.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaServiceImp implements MascotaService{

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public Mascota findMascotaById(Long id) {
        return mascotaRepository.getReferenceById(id);
    }
}
