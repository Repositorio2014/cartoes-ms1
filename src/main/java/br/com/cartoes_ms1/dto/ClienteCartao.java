package br.com.cartoes_ms1.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@ToString
public class ClienteCartao {

    private long id;
    private String name;
    private String cpf;
    private BigDecimal nrCartao;
    private int codigo;
}
