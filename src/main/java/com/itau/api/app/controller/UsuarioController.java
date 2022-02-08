package com.itau.api.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.api.app.model.Usuario;
import com.itau.api.app.service.UsuarioService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
//@Api(value = "API REST Usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/usuarios")
	@ApiOperation(value = "Retorna uma lista de Usuarios")
	public List<Usuario> listaUsuario() {
		return usuarioService.findAll();

	}

	@GetMapping("/usuario/{id}")
	@ApiOperation(value = "Retorna um Usuario unico")
	public Usuario listaUsuarioPorId(@PathVariable(value = "id") long id) {
		return usuarioService.findById(id);

	}

	@PostMapping("/usuario")
	@ApiOperation(value = "Atualiza um usuario")
	public Usuario salvaUsuario(@RequestBody Usuario Usuario) {
		return usuarioService.save(Usuario);

	}

	@DeleteMapping("/usuario")
	@ApiOperation(value = "Remove um Usuario")
	public void deletaUsuario(@RequestBody Usuario Usuario) {
		usuarioService.delete(Usuario);
	}

}
