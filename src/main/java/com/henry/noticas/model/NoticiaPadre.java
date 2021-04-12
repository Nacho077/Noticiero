package com.henry.noticas.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, visible = true, property = "noticiaEnum")
@JsonSubTypes({
        @JsonSubTypes.Type(value = NoticiaVideo.class, name = "VIDEO"),
        @JsonSubTypes.Type(value = NoticiaImagenes.class, name = "IMAGENES"),
        @JsonSubTypes.Type(value = NoticiaTexto.class, name = "TEXTO")
})
@Inheritance
public abstract class NoticiaPadre implements Serializable {

    @Id
    private Integer id;
    private String titulo, descripcion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "persona_id")
    private Persona escritor;

    @AccessType(AccessType.Type.PROPERTY)
    public abstract NoticiaEnum noticiaEnum();
}
