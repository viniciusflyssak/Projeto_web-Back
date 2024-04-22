package br.edu.utfpr.projeto_web_back.server.service.Impl;

import br.edu.utfpr.projeto_web_back.server.model.Pedido;
import br.edu.utfpr.projeto_web_back.server.repository.PedidoRepository;
import br.edu.utfpr.projeto_web_back.server.service.IPedidoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends CrudServiceImpl<Pedido, Long> implements IPedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    protected JpaRepository<Pedido, Long> getRepository(){
        return pedidoRepository;
    }

}
