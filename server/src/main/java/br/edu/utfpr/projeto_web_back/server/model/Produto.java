package br.edu.utfpr.projeto_web_back.server.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "PRODUTOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    private String imagem; //A princípio, irá salvar apenas a url da imagem.

    @ManyToOne
    private Categoria categoria;
}
