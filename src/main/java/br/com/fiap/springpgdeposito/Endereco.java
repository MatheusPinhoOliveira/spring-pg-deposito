package br.com.fiap.springpgdeposito;
import jakarta.persistence.*;


@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;
    private String numero;
    private String complemento;
}
