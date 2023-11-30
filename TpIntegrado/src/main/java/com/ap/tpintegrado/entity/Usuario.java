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
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, length = 20)
    private String pass;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean activo = true;

    // Relaciones
}
