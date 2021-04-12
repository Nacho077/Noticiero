package com.henry.noticas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonaDTO {

    private Integer id;
    private String nombre, apellido;
}
