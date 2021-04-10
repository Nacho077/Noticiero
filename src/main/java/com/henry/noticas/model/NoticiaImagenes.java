package com.henry.noticas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class NoticiaImagenes extends NoticiaPadre{

    private List<String> urlImagenes;

    @Override
    public NoticiaEnum noticiaEnum() {
        return NoticiaEnum.IMAGENES;
    }
}
