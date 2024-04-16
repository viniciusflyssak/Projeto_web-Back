package br.edu.utfpr.projeto_web_back.server.controller;

import br.edu.utfpr.projeto_web_back.server.dto.CategoriaDto;
import br.edu.utfpr.projeto_web_back.server.dto.UsuarioDto;
import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import br.edu.utfpr.projeto_web_back.server.service.ICategoriaService;
import br.edu.utfpr.projeto_web_back.server.service.ICrudService;
import br.edu.utfpr.projeto_web_back.server.service.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController extends CrudController<Usuario, UsuarioDto, Long>{

    private final IUsuarioService service;
    private final ModelMapper modelMapper;

    public UsuarioController(IUsuarioService service, ModelMapper modelMapper) {
            super(Usuario.class, UsuarioDto.class);
            this.service = service;
            this.modelMapper = modelMapper;
        }

        @Override
        protected ICrudService<Usuario, Long> getService() {
            return service;
        }

        @Override
        protected ModelMapper getModelMapper() {
            return modelMapper;
        }

}
