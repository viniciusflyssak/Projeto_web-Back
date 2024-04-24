package br.edu.utfpr.projeto_web_back.server.repository;

import br.edu.utfpr.projeto_web_back.server.model.Pedido;
import br.edu.utfpr.projeto_web_back.server.model.Produto;
import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findPedidosByUsuario(Usuario usuario);
}
