package br.com.cartoes_ms1.service;

import br.com.cartoes_ms1.dto.ClienteCartao;
import br.com.cartoes_ms1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteCartao, Long> {
}
