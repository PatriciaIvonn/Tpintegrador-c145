package com.ap.tpintegrado.repository;

import com.example.tpspringboot.entity.Nacionalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacionalidadRepository extends JpaRepository<Nacionalidad, Long> {
}
