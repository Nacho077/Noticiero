package com.henry.noticas.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, visible = true, property = "noticiaEnum")
@JsonSubTypes({
        @JsonSubTypes.Type(value = NoticiaVideo.class, name = "VIDEO"),
        @JsonSubTypes.Type(value = NoticiaImagenes.class, name = "IMAGENES"),
        @JsonSubTypes.Type(value = NoticiaTexto.class, name = "TEXTO")
})
public abstract class NoticiaPadre {

    @Id
    private Integer id;
    private String titulo, descripcion;
    private Persona escritor;

    @AccessType(AccessType.Type.PROPERTY)
    public abstract NoticiaEnum noticiaEnum();
}
