package com.henry.noticas.model;

public enum NoticiaEnum {

    VIDEO("VIDEO"),
    IMAGENES("IMAGENES"),
    TEXTO("TEXTO");

    private String descripcion;

    NoticiaEnum(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public static NoticiaEnum find(String value){
        for(NoticiaEnum n: values()){
            if(n.toString().equalsIgnoreCase(value)){
                return n;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid NoticiaType: %s", value));
    }
}
