package com.itau.api.app.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.itau.api.app.model.Usuario;
import com.itau.api.app.repository.UsuarioRepository;
import com.itau.api.app.service.UsuarioService;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceImplTest {

	@InjectMocks
	UsuarioService service = new UsuarioServiceImpl();

	@Mock
	UsuarioRepository usuarioRepository;

	@Test
	void testFindAll() {

		List<Usuario> listaUsuario = new ArrayList<>();
		doReturn(listaUsuario)
		.when(usuarioRepository).findAll();
		
		assertEquals(listaUsuario,service.findAll());
	}

	@Test
	void testFindyById() {

		Usuario usuario = new Usuario();
		long id = 1;

		when(usuarioRepository.findById(id)).thenReturn(usuario);

		assertEquals(usuario, service.findById(id), "This object should not be null");
	}

	@Test
	void testSave() {

		Usuario usuario = new Usuario();

		when(usuarioRepository.save(usuario)).thenReturn(usuario);

		assertEquals(usuario, service.save(usuario), "This object should not be null");
	}
	
	
	@Test
	void testDelete() {

		Usuario usuario = new Usuario();

		
		assertEquals("Registro removido com sucesso", service.delete(usuario), "This object should not be null");
	}
	
	

}
