package br.edu.utfpr.projeto_web_back.server.service.Impl;

import br.edu.utfpr.projeto_web_back.server.model.ItensPedido;
import br.edu.utfpr.projeto_web_back.server.repository.ItensPedidoRepository;
import br.edu.utfpr.projeto_web_back.server.service.IItensPedidoService;
import org.springframework.data.jpa.repository.JpaRepository;

public class ItensPedidoServiceImpl extends CrudServiceImpl<ItensPedido, Long> implements IItensPedidoService {

    private final ItensPedidoRepository itensPedidoRepository;

    public ItensPedidoServiceImpl(ItensPedidoRepository itensPedidoRepository){
        this.itensPedidoRepository = itensPedidoRepository;
    }

    @Override
    protected JpaRepository<ItensPedido, Long> getRepository(){
        return itensPedidoRepository;
    }

}
