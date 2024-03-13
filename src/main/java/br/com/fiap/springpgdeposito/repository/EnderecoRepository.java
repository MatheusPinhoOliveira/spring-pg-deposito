package br.com.fiap.springpgdeposito.repository;

import br.com.fiap.springpgdeposito.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
