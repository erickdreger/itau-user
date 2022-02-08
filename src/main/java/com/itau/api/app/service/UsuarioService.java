package com.itau.api.app.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.itau.api.app.model.Usuario;

@Component
public interface UsuarioService {

	List<Usuario> findAll();

	Usuario findById(long id);

	Usuario save(Usuario usuario);

	void delete(Usuario usuario);

}
