package br.com.cartoes_ms1.service;

import br.com.cartoes_ms1.dto.ClienteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "apiCliente", url = "http://viacep.com.br/ws/01001000/json/")
public interface ApiCliente {
    @GetMapping("/dados/{id}")
    ClienteDto getDadosPorId(@PathVariable("id") Long id);
}
