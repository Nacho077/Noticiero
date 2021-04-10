package com.henry.noticas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public abstract class NoticiaPadre {

    @Id
    private Integer id;
    private String titulo, descripcion;
    private Persona escritor;
}
