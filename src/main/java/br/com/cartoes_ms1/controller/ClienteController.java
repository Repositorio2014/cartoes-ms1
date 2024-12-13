package br.com.cartoes_ms1.controller;

import br.com.cartoes_ms1.dto.ClienteCartao;
import br.com.cartoes_ms1.service.DadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartao")
public class ClienteController {

    @Autowired
    private DadosService dadosService;

    @GetMapping("/getCartao")
    public String getCartao() {
        return dadosService.getCartaoId();
    }

    @PostMapping
    public ResponseEntity<ClienteCartao> novaCliente(@RequestBody ClienteCartao cliente){
        return ResponseEntity.ok(this.dadosService.create(cliente));
    }
}
