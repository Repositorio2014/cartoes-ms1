package br.com.cartoes_ms1.service;

import br.com.cartoes_ms1.dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosService {
    @Autowired
    private ApiCliente apiCliente;
    public ClienteDto obterDadosPorId(Long id) {
        return apiCliente.getDadosPorId(id);
    }
}
