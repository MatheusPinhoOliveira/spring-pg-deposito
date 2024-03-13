package br.com.fiap.springpgdeposito;
import jakarta.persistence.*;


@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
}
