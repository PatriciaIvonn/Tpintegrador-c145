package com.ap.tpintegrado.repository;

import com.ap.tpintegrado.entity.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TecnicoRepository extends JpaRepository<Tecnico,Long> {
}
