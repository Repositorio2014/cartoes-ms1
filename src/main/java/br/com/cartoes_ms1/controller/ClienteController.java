package br.com.cartoes_ms1.controller;

import br.com.cartoes_ms1.dto.ClienteDto;
import br.com.cartoes_ms1.service.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartao")
public class ClienteController {

    @Autowired
    private DadosService dadosService;

    @GetMapping("/dados/{id}")
    public ClienteDto getDados(@PathVariable Long id) {
        return dadosService.obterDadosPorId(id);
    }
}
