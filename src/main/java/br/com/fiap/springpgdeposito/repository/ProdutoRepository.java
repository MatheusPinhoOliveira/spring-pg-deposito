package br.com.fiap.springpgdeposito.repository;

import br.com.fiap.springpgdeposito.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}