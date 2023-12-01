package com.ap.tpintegrado.repository;

import com.ap.tpintegrado.entity.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Long> {
}
