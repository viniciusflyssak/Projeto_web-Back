package br.edu.utfpr.projeto_web_back.server.dto;

import br.edu.utfpr.projeto_web_back.server.model.Categoria;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoDto {
    private Long idProduto;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    private String imagem;

    private Categoria categoria;
}
