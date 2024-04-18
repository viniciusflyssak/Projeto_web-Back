package br.edu.utfpr.projeto_web_back.server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "PEDIDO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long valor;

    @NotNull
    private LocalDate data;

    @NotNull
    private int formaPagamento;

    @ManyToOne
    private Usuario usuario;

    @OneToMany
    private List<ItensPedido> itensPedido;
}
