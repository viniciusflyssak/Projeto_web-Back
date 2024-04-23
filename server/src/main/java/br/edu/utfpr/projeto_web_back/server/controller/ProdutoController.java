package br.edu.utfpr.projeto_web_back.server.controller;

import br.edu.utfpr.projeto_web_back.server.dto.ProdutoDto;
import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import br.edu.utfpr.projeto_web_back.server.model.Produto;
import br.edu.utfpr.projeto_web_back.server.service.ICrudService;
import br.edu.utfpr.projeto_web_back.server.service.IProdutoService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("produtos")
public class ProdutoController extends CrudController<Produto, ProdutoDto, Long>{

    private final IProdutoService service;
    private final ModelMapper modelMapper;

    public ProdutoController(IProdutoService service, ModelMapper modelMapper) {
            super(Produto.class, ProdutoDto.class);
            this.service = service;
            this.modelMapper = modelMapper;
        }

    @Override
    protected ICrudService<Produto, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
            return modelMapper;
        }

    @GetMapping("/ProdutosPorCategoria")
    public ResponseEntity<List<ProdutoDto>> findProdutosByCategoria(@RequestParam("categoria") Long categoriaId) {
        Categoria categoria = new Categoria();
        categoria.setId(categoriaId);
        List<Produto> produtos = service.findProdutosByCategoria(categoria);
        List<ProdutoDto> produtosDto = produtos.stream()
                .map(produto -> modelMapper.map(produto, ProdutoDto.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(produtosDto);
    }
}
