package com.ap.tpintegrado.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicio;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean activo = true;

    @ManyToMany(mappedBy = "servicios")
    Set<Cliente> clientes;
}
