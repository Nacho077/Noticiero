package com.henry.noticas.service;

import com.henry.noticas.model.Persona;
import com.henry.noticas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona getPersona(Integer id) {
        return personaRepository.findById(id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }

    public void addPersona(Persona persona) {
        personaRepository.save(persona);
    }

    public void addNoticia(Integer id, Integer noticiaId) {

    }
}
