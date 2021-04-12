package com.henry.noticas.service;

import com.henry.noticas.model.NoticiaPadre;
import com.henry.noticas.model.Persona;
import com.henry.noticas.repository.NoticiaRepository;
import com.henry.noticas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private NoticiaService noticiaService;
    @Autowired
    private NoticiaRepository noticiaRepository;

    public Persona getPersona(Integer id) {
        return personaRepository.findById(id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

    public void addPersona(Persona persona) {
        personaRepository.save(persona);
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    public void addNoticiaToPersona(Integer id, Integer noticiaId) {
        NoticiaPadre noticia = noticiaService.getById(noticiaId);
        Persona escritor = this.getPersona(id);
        noticia.setEscritor(escritor);
        noticiaRepository.save(noticia);
    }

    public void removePersona(Integer id) {
        personaRepository.deleteById(id);
    }
}
