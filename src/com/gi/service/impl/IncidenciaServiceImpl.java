package com.gi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gi.entity.Incidencia;
import com.gi.repository.IncidenciaRepository;
import com.gi.service.IncidenciaService;

@Service("incidenciaService")
public class IncidenciaServiceImpl implements IncidenciaService {

	@Autowired
	private IncidenciaRepository incidenciaRepository;

	@Override
	public List<Incidencia> getListIncidencia() {
		return incidenciaRepository.findAll();
	}

	@Override
	public void registar(Incidencia incidencia) {
		incidenciaRepository.save(incidencia);

	}

}
