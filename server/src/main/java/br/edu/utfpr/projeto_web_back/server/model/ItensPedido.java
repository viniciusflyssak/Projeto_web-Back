package br.edu.utfpr.projeto_web_back.server.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ITENS_PEDIDO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItensPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItensPedido;

    private BigDecimal preco;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Pedido pedido;
}
