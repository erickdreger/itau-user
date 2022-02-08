package com.itau.api.app.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.itau.api.app.model.Usuario;
import com.itau.api.app.service.UsuarioService;

@ExtendWith(MockitoExtension.class)
class UsuarioControllerTest {

	@InjectMocks
	UsuarioController controller;

	@Mock
	UsuarioService usuarioService;

	@Test
	void testFindAll() {

		List<Usuario> listaUsuario = new ArrayList<>();

		when(usuarioService.findAll()).thenReturn(listaUsuario);

		assertEquals(listaUsuario, controller.listaUsuario(), "This object should not be null");
	}

	@Test
	void testFindyById() {

		Usuario usuario = new Usuario();
		long id = 1;

		when(usuarioService.findById(id)).thenReturn(usuario);

		assertEquals(usuario, controller.listaUsuarioPorId(id), "This object should not be null");
	}

	@Test
	void testSave() {

		Usuario usuario = new Usuario();

		when(usuarioService.save(usuario)).thenReturn(usuario);

		assertEquals(usuario, controller.salvaUsuario(usuario), "This object should not be null");
	}

	@Test
	void testDelete() {

		Usuario usuario = new Usuario();
		
		assertEquals("Registro removido com sucesso", controller.deletaUsuario(usuario), "This object should not be null");
	}

}
