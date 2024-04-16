package br.edu.utfpr.projeto_web_back.server.repository;

import br.edu.utfpr.projeto_web_back.server.model.ItensPedido;
import br.edu.utfpr.projeto_web_back.server.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedido, Long> {
}
