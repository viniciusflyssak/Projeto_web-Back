package br.edu.utfpr.projeto_web_back.server.service.Impl;

import br.edu.utfpr.projeto_web_back.server.model.Produto;
import br.edu.utfpr.projeto_web_back.server.repository.ProdutoRepository;
import br.edu.utfpr.projeto_web_back.server.service.IProdutoService;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long> implements IProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @Override
    protected JpaRepository<Produto, Long> getRepository(){
        return produtoRepository;
    }

}
