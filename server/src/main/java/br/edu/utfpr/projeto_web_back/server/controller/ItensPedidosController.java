package br.edu.utfpr.projeto_web_back.server.controller;

import br.edu.utfpr.projeto_web_back.server.dto.ItensPedidoDto;
import br.edu.utfpr.projeto_web_back.server.model.ItensPedido;
import br.edu.utfpr.projeto_web_back.server.service.ICrudService;
import br.edu.utfpr.projeto_web_back.server.service.IItensPedidoService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("itens_pedidos")
public class ItensPedidosController extends CrudController<ItensPedido, ItensPedidoDto, Long> {

    private final IItensPedidoService service;
    private final ModelMapper modelMapper;

    public ItensPedidosController(IItensPedidoService service, ModelMapper modelMapper) {
            super(ItensPedido.class, ItensPedidoDto.class);
            this.service = service;
            this.modelMapper = modelMapper;
        }

        @Override
        protected ICrudService<ItensPedido, Long> getService() {
            return service;
        }

        @Override
        protected ModelMapper getModelMapper() {
            return modelMapper;
        }

}
