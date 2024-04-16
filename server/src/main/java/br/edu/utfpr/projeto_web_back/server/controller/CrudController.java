package br.edu.utfpr.projeto_web_back.server.controller;

import br.edu.utfpr.projeto_web_back.server.service.ICrudService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

//Importante lembrar: D = Dto, T = Tipo da classe
public abstract class CrudController<T, D, ID extends Serializable> {

    protected abstract ICrudService<T, ID> getService();

    protected abstract ModelMapper getModelMapper();

    private final Class<T> tipoClasse;

    private final Class<D> tipoDto;

    public CrudController(Class<T> tipoClasse, Class<D> tipoDto){
        this.tipoClasse = tipoClasse;
        this.tipoDto = tipoDto;
    }

    public D converterParaDto(T entidade){
        return getModelMapper().map(entidade, this.tipoDto);
    }

    public T converterParaEntidade(D dto){
        return getModelMapper().map(dto, this.tipoClasse);
    }

    @PostMapping
    public ResponseEntity<D> create(@RequestBody @Valid D entidade) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(converterParaDto(getService().save(converterParaEntidade(entidade))));

    }

    @PutMapping("{id}")
    public ResponseEntity<D> update(@PathVariable ID id, @RequestBody @Valid D entidade) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(converterParaDto(getService().save(converterParaEntidade(entidade))));

    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) {
        getService().delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping //http://ip.api:port/classname
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(
                getService().findAll().stream().map(
                        this::converterParaDto).collect(Collectors.toList()
                )
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<D> findOne(@PathVariable ID id) {
        T entidade = getService().findOne(id);
        if ( entidade != null) {
            return ResponseEntity.ok(converterParaDto(entidade));
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
