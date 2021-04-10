package com.henry.noticas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NoticiaTexto extends NoticiaPadre{

    private String texto;

    @Override
    public NoticiaEnum noticiaEnum() {
        return NoticiaEnum.TEXTO;
    }
}
