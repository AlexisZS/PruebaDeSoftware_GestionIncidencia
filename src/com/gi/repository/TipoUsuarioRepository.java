package com.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gi.entity.TipoUsuario;

@Repository
public interface TipoUsuarioRepository  extends JpaRepository<TipoUsuario,Integer>{

}
