package br.edu.utfpr.projeto_web_back.server.service.Impl;

import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import br.edu.utfpr.projeto_web_back.server.repository.CategoriaRepository;
import br.edu.utfpr.projeto_web_back.server.service.ICategoriaService;
import org.springframework.data.jpa.repository.JpaRepository;

public class CategoriaServiceImpl extends CrudServiceImpl<Categoria, Long> implements ICategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    protected JpaRepository<Categoria, Long> getRepository(){
        return categoriaRepository;
    }

}
