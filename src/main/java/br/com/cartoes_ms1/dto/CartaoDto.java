package br.com.cartoes_ms1.dto;

import br.com.cartoes_ms1.model.Cartao;
import br.com.cartoes_ms1.model.Cliente;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@Data
@Getter
@Setter
@ToString
public class CartaoDto {
    private long id;
    private BigDecimal numero;
    private Cliente cliente;
    private Integer validade;
    private int codigo;
    private boolean ativo;

    public static CartaoDto convert(Cartao model){
        CartaoDto dto = new CartaoDto();

        dto.setId(model.getId());
        dto.setNumero(model.getNumero());
        dto.setCliente(model.getCliente());
        dto.setValidade(model.getValidade());
        dto.setCodigo(model.getCodigo());
        dto.setAtivo(model.isAtivo());
        return dto;
    }
}
