package br.edu.utfpr.projeto_web_back.server.controller;

import br.edu.utfpr.projeto_web_back.server.dto.CategoriaDto;
import br.edu.utfpr.projeto_web_back.server.dto.PedidoDto;
import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import br.edu.utfpr.projeto_web_back.server.model.Pedido;
import br.edu.utfpr.projeto_web_back.server.service.ICategoriaService;
import br.edu.utfpr.projeto_web_back.server.service.ICrudService;
import br.edu.utfpr.projeto_web_back.server.service.IPedidoService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
public class PedidosController extends CrudController<Pedido, PedidoDto, Long>{

    private final IPedidoService service;
    private final ModelMapper modelMapper;

    public PedidosController(IPedidoService service, ModelMapper modelMapper) {
            super(Pedido.class, PedidoDto.class);
            this.service = service;
            this.modelMapper = modelMapper;
        }

        @Override
        protected ICrudService<Pedido, Long> getService() {
            return service;
        }

        @Override
        protected ModelMapper getModelMapper() {
            return modelMapper;
        }

}
