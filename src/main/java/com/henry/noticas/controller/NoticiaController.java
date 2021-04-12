package com.henry.noticas.controller;

import com.henry.noticas.model.NoticiaEnum;
import com.henry.noticas.model.NoticiaPadre;
import com.henry.noticas.model.PaginationResponse;
import com.henry.noticas.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noticia")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @PostMapping
    public void addNoticia(@RequestBody NoticiaPadre noticia){
        noticiaService.addNoticia(noticia);
    }

    @GetMapping
    public PaginationResponse<NoticiaPadre> getAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "20") Integer size
    ){
        return noticiaService.getAll(page, size);
    }

    @GetMapping("/{id}")
    public NoticiaPadre getById(@PathVariable Integer id){
        return noticiaService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void removeNoticia(@PathVariable Integer id){
        noticiaService.removeNoticia(id);
    }
}
