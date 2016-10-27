package com.gi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gi.entity.Estado;
import com.gi.repository.EstadoRepository;
import com.gi.service.EstadoService;

@Service("estadoService")
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public List<Estado> getListEstado() {
		return estadoRepository.findAll();
	}

}
