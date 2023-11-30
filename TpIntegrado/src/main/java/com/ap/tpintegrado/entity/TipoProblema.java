package com.ap.tpintegrado.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tipo_problema")
public class TipoProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoProblema;

    @Column(nullable = false, length = 255)
    private String tipo;

    @Column(nullable = false)
    private int tiempoEstimado;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean activo = true;

    // Relaciones
}
