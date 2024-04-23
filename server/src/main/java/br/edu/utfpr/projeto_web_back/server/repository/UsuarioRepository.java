package br.edu.utfpr.projeto_web_back.server.repository;

import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findUserByUsername(String username);
}
