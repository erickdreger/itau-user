package com.itau.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.api.model.Usuario;
import com.itau.api.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/api")
//@Api(value = "API REST Usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping("/usuarios")
//	@ApiOperation(value = "Retorna uma lista de Usuarios")
	public List<Usuario> listaUsuario() {
		return usuarioRepository.findAll();

	}

	@GetMapping("/usuario/{id}")
//	@ApiOperation(value = "Retorna um Usuario unico")
	public Usuario listaUsuarioPorId(@PathVariable(value = "id") long id) {
		return usuarioRepository.findById(id);

	}

	@PostMapping("/usuario")
//	@ApiOperation(value = "Salva um Usuario novo")
	public Usuario salvaUsuario(@RequestBody Usuario Usuario) {
		return usuarioRepository.save(Usuario);

	}

	@DeleteMapping("/usuario")
//	@ApiOperation(value = "Remove um Usuario")
	public void deletaUsuario(@RequestBody Usuario Usuario) {
		usuarioRepository.delete(Usuario);
	}

	@PutMapping("/usuario")
//	@ApiOperation(value = "Atualiza um Usuario")
	public Usuario atualizaUsuario(@RequestBody Usuario Usuario) {
		return usuarioRepository.save(Usuario);
	}

}
