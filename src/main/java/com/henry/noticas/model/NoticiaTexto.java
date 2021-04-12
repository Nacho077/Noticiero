package com.henry.noticas.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity(name = "NoticiaTexto")
public class NoticiaTexto extends NoticiaPadre{

    private String texto;

    @Override
    public NoticiaEnum noticiaEnum() {
        return NoticiaEnum.TEXTO;
    }
}
