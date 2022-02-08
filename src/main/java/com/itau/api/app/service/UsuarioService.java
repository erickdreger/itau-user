package com.itau.api.app.service;

import java.util.List;

import com.itau.api.app.model.Usuario;

public interface UsuarioService {

	List<Usuario> findAll();

	Usuario findById(long id);

	Usuario save(Usuario usuario);

	void delete(Usuario usuario);

}
