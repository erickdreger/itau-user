package com.itau.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itau.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	public Usuario findById(long id);

}
