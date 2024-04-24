package br.edu.utfpr.projeto_web_back.server.service;

import br.edu.utfpr.projeto_web_back.server.model.Pedido;
import br.edu.utfpr.projeto_web_back.server.model.Usuario;

import java.util.List;

public interface IPedidoService extends ICrudService<Pedido, Long>{

    List<Pedido> findPedidosByUsuario(Usuario usuario);
}
