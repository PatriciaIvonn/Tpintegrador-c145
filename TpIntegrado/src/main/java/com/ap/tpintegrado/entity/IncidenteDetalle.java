package com.ap.tpintegrado.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class IncidenteDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(nullable = false, length = 255)
    private String razonSocial;

    @Column(nullable = false, length = 20)
    private String cuit;

    @Column(nullable = false, length = 255)
    private String mail;


}
