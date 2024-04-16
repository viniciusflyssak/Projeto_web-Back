package br.edu.utfpr.projeto_web_back.server.dto;

import br.edu.utfpr.projeto_web_back.server.model.ItensPedido;
import br.edu.utfpr.projeto_web_back.server.model.Usuario;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PedidoDto {

        private Long id;

        @NotNull
        private Long valor;

        @NotNull
        private LocalDate data;

        private Usuario usuario;

        private List<ItensPedido> itensPedido;
}