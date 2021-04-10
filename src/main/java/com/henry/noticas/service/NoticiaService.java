package com.henry.noticas.service;

import com.henry.noticas.model.NoticiaEnum;
import com.henry.noticas.model.NoticiaPadre;
import com.henry.noticas.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    public void addNoticia(NoticiaPadre noticia) {
        noticiaRepository.save(noticia);
    }

    public Page<NoticiaPadre> getAll(Integer page, Integer size, NoticiaEnum noticiaEnum) {
        return (Page<NoticiaPadre>) noticiaRepository.findAll();
    }
}
