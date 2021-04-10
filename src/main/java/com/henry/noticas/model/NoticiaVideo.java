package com.henry.noticas.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NoticiaVideo extends NoticiaPadre{

    private String urlVideo;

    @Override
    public NoticiaEnum noticiaEnum() {
        return NoticiaEnum.VIDEO;
    }
}
