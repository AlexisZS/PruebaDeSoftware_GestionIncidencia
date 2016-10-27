package com.gi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gi.entity.Usuario;
import com.gi.repository.UsuarioRepository;
import com.gi.service.UsuarioService;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> getListUsuario() {
		return usuarioRepository.findAll();
	}

}
