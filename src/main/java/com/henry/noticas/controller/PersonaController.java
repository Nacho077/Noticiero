package com.henry.noticas.controller;

import com.henry.noticas.model.Persona;
import com.henry.noticas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public void addPersona(@RequestBody Persona persona){
        personaService.addPersona(persona);
    }

    @GetMapping("/{id}")
    public Persona getPersona(@PathVariable Integer id){
        return personaService.getPersona(id);
    }

    @PutMapping("/{id}/noticia/{noticiaId}")
    public void addNoticia(@PathVariable Integer id, @PathVariable Integer noticiaId){
        personaService.addNoticia(id, noticiaId);
    }
}
