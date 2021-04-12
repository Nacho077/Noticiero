package com.henry.noticas.service;

import com.henry.noticas.model.NoticiaPadre;
import com.henry.noticas.model.PaginationResponse;
import com.henry.noticas.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Objects;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    public void addNoticia(NoticiaPadre noticia) {
        noticiaRepository.save(noticia);
    }

    public PaginationResponse<NoticiaPadre> getAll(Integer page, Integer size) {
        if(!Objects.isNull(page) && !Objects.isNull(size)){
            Pageable pageable = PageRequest.of(page, size);
            Page<NoticiaPadre> noticiasPage = noticiaRepository.findAll(pageable);
            return new PaginationResponse<>(
                    noticiasPage.getContent(),
                    noticiasPage.getTotalPages(),
                    noticiasPage.getTotalElements()
            );
        }
        List<NoticiaPadre> listNoticias = noticiaRepository.findAll();
        return new PaginationResponse<>(listNoticias, 1, (long) listNoticias.size());
    }

    public void removeNoticia(Integer id) {
        noticiaRepository.deleteById(id);
    }

    public NoticiaPadre getById(Integer id) {
        return noticiaRepository.findById(id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }
}
