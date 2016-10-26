package com.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gi.entity.Incidencia;


@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Integer> {

}
