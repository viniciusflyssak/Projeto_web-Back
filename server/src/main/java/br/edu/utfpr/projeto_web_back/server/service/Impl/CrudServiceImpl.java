package br.edu.utfpr.projeto_web_back.server.service.Impl;

import br.edu.utfpr.projeto_web_back.server.service.ICrudService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public abstract class CrudServiceImpl<T, ID extends Serializable> implements ICrudService<T, ID> {

    protected abstract JpaRepository<T, ID> getRepository(); //Responsável por obter o repositório da classe em questão;

    @Override
    public List<T> findAll() {
        return getRepository().findAll(); //Implementação efetiva do findAll, onde está de fato carregando os dado do repository;
    }

    @Override
    public T save(T entity) {
        return getRepository().save(entity); //Implementação do método que salva no banco;
    }

    @Override
    public void flush() {
        getRepository().flush(); //Implementação efetiva do método que finalizada a transação no banco de dados, salvando as alterações;
    }

    @Override
    public T findOne(ID id) {
        return getRepository().findById(id).orElse(null); //Implementação efetiva do método que busca pelo id;
    }

    @Override
    public void delete(ID id) {
        getRepository().deleteById(id); //Implementação efetiva do método que deleta o registro pelo id;
    }

    public Page<T> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }
}
