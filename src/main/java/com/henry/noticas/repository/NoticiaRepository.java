package com.henry.noticas.repository;

import com.henry.noticas.model.NoticiaPadre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends JpaRepository<NoticiaPadre, Integer>{
}
