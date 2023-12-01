package com.ap.tpintegrado.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "especialidades")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidad;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean activo = true;
    // Relaciones
    @ManyToMany(mappedBy = "listaEspecialidades")
    List<Tecnico>listaTecnicos;


}
