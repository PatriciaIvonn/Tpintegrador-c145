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
@Table(name = "clientes")
public class Cliente {
    @Id;
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long idCliente;

    @Column(nullable = false, length = 255);
    private String razonSocial;

    @Column(nullable = false, length = 20);
    private String cuit;

    @Column(nullable = false, length = 255);
    private String mail;


}
