package br.edu.utfpr.projeto_web_back.server.service.Impl;

import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import br.edu.utfpr.projeto_web_back.server.repository.UsuarioRepository;
import br.edu.utfpr.projeto_web_back.server.service.IUsuarioService;
import org.springframework.data.jpa.repository.JpaRepository;

public class UsuarioServiceImpl extends CrudServiceImpl<Usuario, Long> implements IUsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    protected JpaRepository<Usuario, Long> getRepository(){
        return usuarioRepository;
    }

}
