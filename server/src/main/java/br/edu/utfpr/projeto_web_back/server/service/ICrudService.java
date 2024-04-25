package br.edu.utfpr.projeto_web_back.server.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface ICrudService<T, ID extends Serializable> {
    List<T> findAll(); //Responsável por carregar todos os registros;
    T save(T entity); //Processo simples, irá salvar no banco de dados o objeto passado. Como a transação é
                      // iniciada mas não automaticamente comentada, deve-se executar o flush();
    void flush(); //Comenta a transação no banco de dados;

    T findOne(ID id); //Realiza a busca do registro por id;

    void delete(ID id); //Deleta um registro correspondente a id passada;

    Page<T> findAll(Pageable pageable);
}
