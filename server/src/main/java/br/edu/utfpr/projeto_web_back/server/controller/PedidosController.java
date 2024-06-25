package br.edu.utfpr.projeto_web_back.server.controller;

import br.edu.utfpr.projeto_web_back.server.dto.CategoriaDto;
import br.edu.utfpr.projeto_web_back.server.dto.PedidoDto;
import br.edu.utfpr.projeto_web_back.server.dto.ProdutoDto;
import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import br.edu.utfpr.projeto_web_back.server.model.Pedido;
import br.edu.utfpr.projeto_web_back.server.model.Produto;
import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import br.edu.utfpr.projeto_web_back.server.service.ICategoriaService;
import br.edu.utfpr.projeto_web_back.server.service.ICrudService;
import br.edu.utfpr.projeto_web_back.server.service.IPedidoService;
import br.edu.utfpr.projeto_web_back.server.shared.RespostaGenerica;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/PedidosPorUsuario")
    public ResponseEntity<List<PedidoDto>> findProdutosByUsuario(@RequestParam("usuario") Long usuarioId) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioId);
        List<Pedido> pedidos = service.findPedidosByUsuario(usuario);
        List<PedidoDto> pedidosDto = pedidos.stream()
                .map(pedido -> modelMapper.map(pedido, PedidoDto.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(pedidosDto);
    }
}
