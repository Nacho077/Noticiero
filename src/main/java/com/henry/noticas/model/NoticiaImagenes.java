package com.henry.noticas.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity(name = "NoticiaImagenes")
public class NoticiaImagenes extends NoticiaPadre{

    private List<String> urlImagenes;

    @Override
    public NoticiaEnum noticiaEnum() {
        return NoticiaEnum.IMAGENES;
    }
}
