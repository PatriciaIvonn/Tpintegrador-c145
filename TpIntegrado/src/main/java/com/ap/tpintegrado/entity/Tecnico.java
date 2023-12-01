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
@Table(name = "tecnico")
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTecnico;
    private String nombre;
    private String email;
    private String numTelefono;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean activo = true;
    // Relaciones
    @ManyToMany
    @JoinTable(name = "tecnico_especialidad",
            joinColumns = @JoinColumn(name = "idTecnico"),
            inverseJoinColumns = @JoinColumn(name="especialidadId"))
    private List<Especialidad>listaEspecialidades;



}
