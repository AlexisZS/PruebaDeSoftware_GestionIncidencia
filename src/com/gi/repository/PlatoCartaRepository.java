package com.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gi.entity.PlatoCarta;

@Repository
public interface PlatoCartaRepository extends JpaRepository<PlatoCarta, Long> {

	
}
