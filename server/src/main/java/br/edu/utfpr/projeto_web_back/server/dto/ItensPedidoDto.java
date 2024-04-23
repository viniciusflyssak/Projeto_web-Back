package br.edu.utfpr.projeto_web_back.server.dto;

import br.edu.utfpr.projeto_web_back.server.model.Produto;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItensPedidoDto {
    private Long idItensPedido;

    private BigDecimal preco;

    private Produto produto;
}
