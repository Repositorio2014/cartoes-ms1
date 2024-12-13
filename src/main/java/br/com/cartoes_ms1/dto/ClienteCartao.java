package br.com.cartoes_ms1.dto;

import java.math.BigDecimal;

public class ClienteCartao {

    private long id;
    private String name;
    private String cpf;
    private BigDecimal nrCartao;
    private int codigo;

    public ClienteCartao() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public BigDecimal getNrCartao() {
        return nrCartao;
    }

    public void setNrCartao(BigDecimal nrCartao) {
        this.nrCartao = nrCartao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ClienteCartao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nrCartao=" + nrCartao +
                ", codigo=" + codigo +
                '}';
    }
}
