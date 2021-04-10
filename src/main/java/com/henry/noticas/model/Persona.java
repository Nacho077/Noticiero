package com.henry.noticas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Persona {

    @Id
    private Integer id;
    private String nombre, apellido, dni;
}
