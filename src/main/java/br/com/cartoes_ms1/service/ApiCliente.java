package br.com.cartoes_ms1.service;

import br.com.cartoes_ms1.dto.ClienteCartao;
import br.com.cartoes_ms1.dto.ClienteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "apiCliente", url = "http://localhost:8080/emissor-ms/cartao/")
public interface ApiCliente {
    @GetMapping("/")
    ClienteDto getDadosPorId();

    @GetMapping("/getCartaoId")
    String getCartaoId();

    @PostMapping
    ClienteCartao create(@RequestBody ClienteCartao clienteCartao);
}
