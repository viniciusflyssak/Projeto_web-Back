package br.edu.utfpr.projeto_web_back.server.controller;

import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import br.edu.utfpr.projeto_web_back.server.service.UsuarioService;
import br.edu.utfpr.projeto_web_back.server.shared.RespostaGenerica;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController{

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public RespostaGenerica createUser(@Valid @RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
        return RespostaGenerica.builder().mensagem("Usuário salvo!.").build();
    }

}
