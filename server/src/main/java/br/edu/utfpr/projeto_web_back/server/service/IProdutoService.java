package br.edu.utfpr.projeto_web_back.server.service;

import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import br.edu.utfpr.projeto_web_back.server.model.Produto;

import java.util.List;

public interface IProdutoService extends ICrudService<Produto, Long>{
    List<Produto> findProdutosByCategoria(Categoria categoria);
}
