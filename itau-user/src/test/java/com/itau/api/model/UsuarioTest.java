package com.itau.api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	Usuario usuario;
	
	@BeforeEach
	void init() {
		usuario = new Usuario();		
	}
	
	@Test
	void testUsuario() {
		usuario.setNome("Erick");
		usuario.setStatus("Ativo");
		usuario.setId(1);
		usuario.setAreaTrabalho("ESCRITORIO");
		usuario.setDataCriacao("01-02-2022");
		usuario.setDataUltimaAtualizacao("07-02-2022");
		
		assertEquals("Erick", usuario.getNome(), "NOME DE USUARIO NÃO SETADO");
		assertEquals("Ativo", usuario.getStatus(), "STATUS DE USUARIO NÃO SETADO");
		assertEquals(1, usuario.getId(), "ID DE USUARIO NÃO SETADO");
		assertEquals("ESCRITORIO", usuario.getAreaTrabalho(), "AREA DE TRABALHO DE USUARIO NÃO SETADO");
		assertEquals("01-02-2022", usuario.getDataCriacao(), "DATA DE CRIAÇÃO USUARIO NÃO SETADO");
		assertEquals("07-02-2022", usuario.getDataUltimaAtualizacao(), "DATA DE ATUALIZAÇÃO DE USUARIO NÃO SETADO");
	}

}
