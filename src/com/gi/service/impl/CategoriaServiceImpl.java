package com.gi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gi.entity.Categoria;
import com.gi.repository.CategoriaRepository;
import com.gi.service.CategoriaService;

@Service("categoriaService")
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> getListCategoria() {
		return categoriaRepository.findAll();
	}

}
