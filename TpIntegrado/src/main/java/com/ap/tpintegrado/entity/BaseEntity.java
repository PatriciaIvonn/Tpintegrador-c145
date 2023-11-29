package com.ap.tpintegrado.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class BaseEntity implements Serializable {
    // Identificador autoincremental, no permite null
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    // Se define esta columna para eliminacion logica
    @Column(nullable = false, columnDefinition = "boolean default false")
    private boolean activo = true;

    // Se sobreescribe el metodo para un mejor funcionamiento
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) o;
        return id.equals(that.id);
    }

    // Igual que el item anterior
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
