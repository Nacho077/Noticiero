package com.henry.noticas.controller;

import com.henry.noticas.model.Persona;
import com.henry.noticas.model.PersonaDTO;
import com.henry.noticas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;
    @Autowired
    private ConversionService conversionService;

    @GetMapping
    public List<PersonaDTO> getAllPersonas(){
        return conversionService.convert(personaService.getAllPersonas(), List.class);
    }

    @PostMapping
    public void addPersona(@RequestBody Persona persona){
        personaService.addPersona(persona);
    }

    @GetMapping("/{id}")
    public Persona getPersona(@PathVariable Integer id){
        return personaService.getPersona(id);
    }

    @PutMapping("/{id}/noticia/{noticiaId}")
    public void addNoticiatoPersona(@PathVariable Integer id, @PathVariable Integer noticiaId){
        personaService.addNoticiaToPersona(id, noticiaId);
    }

    @DeleteMapping("/{id}")
    public void removePersona(@PathVariable Integer id){
        personaService.removePersona(id);
    }
}
