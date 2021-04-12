package com.henry.noticas.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity(name = "NoticiaVideo")
public class NoticiaVideo extends NoticiaPadre{

    private String urlVideo;

    @Override
    public NoticiaEnum noticiaEnum() {
        return NoticiaEnum.VIDEO;
    }
}
