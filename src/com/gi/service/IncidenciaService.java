package com.gi.service;

import java.util.List;

import com.gi.entity.Incidencia;

public interface IncidenciaService {

	List<Incidencia>  getListIncidencia();
	void registar(Incidencia incidencia);
}
