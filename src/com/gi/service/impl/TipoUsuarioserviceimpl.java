package com.gi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gi.entity.TipoUsuario;
import com.gi.repository.TipoUsuarioRepository;
import com.gi.service.TipoUsuarioService;

@Service("tipoUsuarioService")
public class TipoUsuarioserviceimpl implements TipoUsuarioService {

	@Autowired
	private TipoUsuarioRepository TipoUsuarioRepository;

	@Override
	public List<TipoUsuario> getListTipoUsuario() {
		return TipoUsuarioRepository.findAll();
	}

}
