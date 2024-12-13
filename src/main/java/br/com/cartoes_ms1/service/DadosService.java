package br.com.cartoes_ms1.service;

import br.com.cartoes_ms1.dto.ClienteCartao;
import br.com.cartoes_ms1.dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosService {
    @Autowired
    private ApiCliente apiCliente;

    @Autowired
    private ClienteRepository clienteRepository;

    public String getCartaoId() {
        return apiCliente.getCartaoId();
    }

    public ClienteCartao create(ClienteCartao clienteCartao){
        ClienteCartao cliente = apiCliente.create(clienteCartao);
        this.clienteRepository.save(cliente);
        return cliente;
    }
}
