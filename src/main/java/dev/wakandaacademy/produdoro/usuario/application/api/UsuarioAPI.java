package dev.wakandaacademy.produdoro.usuario.application.api;

import javax.validation.Valid;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/public/v1/usuario")
public interface UsuarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	UsuarioCriadoResponse postNovoUsuario(@RequestBody @Valid UsuarioNovoRequest usuarioNovo);

	@GetMapping(value = "/{idUsuario}")
	@ResponseStatus(code = HttpStatus.OK)
	UsuarioCriadoResponse buscaUsuarioPorId(@PathVariable UUID idUsuario);

	@PostMapping(value = "/{idUsuario}/foco")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void mudaStatusParaFoco(@PathVariable UUID idUsuario);
}
