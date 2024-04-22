package br.edu.utfpr.projeto_web_back.server.service;

import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import br.edu.utfpr.projeto_web_back.server.repository.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    public UsuarioService(UsuarioRepository usuarioRepository) {

        this.usuarioRepository = usuarioRepository;
        bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public Usuario salvar(Usuario usuario) {
        usuario.setSenha( bCryptPasswordEncoder.encode(usuario.getSenha()) );
        return usuarioRepository.save(usuario);
    }

}
