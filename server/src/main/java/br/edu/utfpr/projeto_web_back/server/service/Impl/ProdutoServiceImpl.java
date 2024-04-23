package br.edu.utfpr.projeto_web_back.server.service.Impl;

import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import br.edu.utfpr.projeto_web_back.server.model.Produto;
import br.edu.utfpr.projeto_web_back.server.repository.ProdutoRepository;
import br.edu.utfpr.projeto_web_back.server.service.IProdutoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long> implements IProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @Override
    protected JpaRepository<Produto, Long> getRepository(){
        return produtoRepository;
    }

    @Override
    public List<Produto> findProdutosByCategoria(Categoria categoria) {
        return produtoRepository.findProdutosByCategoria(categoria);
    }
}
