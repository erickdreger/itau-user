package com.itau.api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itau.api.app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	public Usuario findById(long id);

}
