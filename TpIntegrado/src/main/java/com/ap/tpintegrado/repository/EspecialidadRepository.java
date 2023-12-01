package com.ap.tpintegrado.repository;

import com.ap.tpintegrado.entity.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,Long> {
}
