package com.gi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gi.entity.PlatoCarta;
import com.gi.repository.PlatoCartaRepository;
import com.gi.service.PlatoCartaService;

@Service("platoCartaService")
public class PlatoCartaServiceImpl implements PlatoCartaService {

	@Autowired
	private PlatoCartaRepository  platoCartaRepository;
	
	@Override
	public List<PlatoCarta> listPlatoCarta() {
		return platoCartaRepository.findAll();
	}

}

