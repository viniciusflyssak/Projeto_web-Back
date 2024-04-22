package br.edu.utfpr.projeto_web_back.server.service;

import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import br.edu.utfpr.projeto_web_back.server.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    public AuthService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String nomeUsuario)
                            throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findUserByusername(nomeUsuario);
        if (usuario == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return usuario;
    }
}
