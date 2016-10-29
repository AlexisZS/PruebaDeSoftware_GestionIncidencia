package com.gi.service;

import java.util.List;

import com.gi.entity.Incidencia;

public interface IncidenciaService {

	List<Incidencia>  getListIncidencia();
	Incidencia registar(Incidencia incidencia);
	Incidencia detalle(Integer codInc);
}
