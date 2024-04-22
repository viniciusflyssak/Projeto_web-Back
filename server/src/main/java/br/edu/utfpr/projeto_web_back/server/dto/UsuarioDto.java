package br.edu.utfpr.projeto_web_back.server.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UsuarioDto {
        private long id;

        @NotNull
        private String nome;

        @NotNull
        private String username;

        @NotNull
        private String email;

        @NotNull
        @Size(min = 6)
        private String senha;
}