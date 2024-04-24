package br.edu.utfpr.projeto_web_back.server.service.Impl;

import br.edu.utfpr.projeto_web_back.server.model.*;
import br.edu.utfpr.projeto_web_back.server.repository.ItensPedidoRepository;
import br.edu.utfpr.projeto_web_back.server.repository.PedidoRepository;
import br.edu.utfpr.projeto_web_back.server.service.IPedidoService;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl extends CrudServiceImpl<Pedido, Long> implements IPedidoService {

    private final PedidoRepository pedidoRepository;

    private final ItensPedidoRepository itensPedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository, ItensPedidoRepository itensPedidoRepository){
        this.pedidoRepository = pedidoRepository;
        this.itensPedidoRepository = itensPedidoRepository;
    }

    @Override
    protected JpaRepository<Pedido, Long> getRepository(){
        return pedidoRepository;
    }

    @Override
    public List<Pedido> findPedidosByUsuario(Usuario usuario) {
        return pedidoRepository.findPedidosByUsuario(usuario);
    }
}
