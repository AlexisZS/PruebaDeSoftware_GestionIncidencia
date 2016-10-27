package com.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gi.entity.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria,Integer>{

}
