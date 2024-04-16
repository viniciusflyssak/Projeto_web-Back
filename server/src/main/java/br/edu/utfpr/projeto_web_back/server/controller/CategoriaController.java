package br.edu.utfpr.projeto_web_back.server.controller;

import br.edu.utfpr.projeto_web_back.server.dto.CategoriaDto;
import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import br.edu.utfpr.projeto_web_back.server.service.ICategoriaService;
import br.edu.utfpr.projeto_web_back.server.service.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorias")
public class CategoriaController extends CrudController<Categoria, CategoriaDto, Long>{

    private final ICategoriaService service;
    private final ModelMapper modelMapper;

    public CategoriaController(ICategoriaService service, ModelMapper modelMapper) {
            super(Categoria.class, CategoriaDto.class);
            this.service = service;
            this.modelMapper = modelMapper;
        }

        @Override
        protected ICrudService<Categoria, Long> getService() {
            return service;
        }

        @Override
        protected ModelMapper getModelMapper() {
            return modelMapper;
        }

}
