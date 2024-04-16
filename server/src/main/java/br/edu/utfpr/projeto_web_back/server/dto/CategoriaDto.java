package br.edu.utfpr.projeto_web_back.server.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoriaDto {
    private int id;

    @NotNull
    @Size(min = 2, max = 50)
    private String name;
}
