package br.com.cartoes_ms1.model;

import br.com.cartoes_ms1.dto.CartaoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "cartao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cartao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private BigDecimal numero;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    private Integer validade;
    private int codigo;
    private boolean ativo;

    public static Cartao convert(CartaoDto model){
        Cartao cartao = new Cartao();

        cartao.setId(model.getId());
        cartao.setNumero(model.getNumero());
        cartao.setCliente(model.getCliente());
        cartao.setValidade(model.getValidade());
        cartao.setCodigo(model.getCodigo());
        cartao.setAtivo(model.isAtivo());
        return cartao;
    }
}
