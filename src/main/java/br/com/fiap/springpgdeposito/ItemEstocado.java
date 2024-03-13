package br.com.fiap.springpgdeposito;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class ItemEstocado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroDeSerie;

    @ManyToOne
    private Produto produto;

    private BigDecimal quantidade;

    private LocalDateTime dataEntrada;

    @ManyToOne
    private Deposito deposito;

    @ManyToOne
    private Endereco endereco;
}
