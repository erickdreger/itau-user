package com.itau.api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itau.api.app.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	public Usuario findById(long id);

}
