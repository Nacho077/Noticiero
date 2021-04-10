package com.henry.noticas.controller;

import com.henry.noticas.model.NoticiaEnum;
import com.henry.noticas.model.NoticiaPadre;
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
    public Page<NoticiaPadre> getAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "size", required = false, defaultValue = "20") Integer size,
            @RequestParam(value = "noticiaType", required = false, defaultValue = "ALL") NoticiaEnum noticiaEnum
    ){
        return noticiaService.getAll(page, size, noticiaEnum);
    }
}
