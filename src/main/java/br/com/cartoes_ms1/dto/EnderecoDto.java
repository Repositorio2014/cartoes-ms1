package br.com.cartoes_ms1.dto;

import br.com.cartoes_ms1.model.Endereco;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class EnderecoDto {
    private Long id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private int numero;
    private String uf;
    private String ddd;

    public static EnderecoDto convert(Endereco model){
        EnderecoDto dto = new EnderecoDto();

        dto.setId(model.getId());
        dto.setCep(model.getCep());
        dto.setLogradouro(model.getLogradouro());
        dto.setComplemento(model.getComplemento());
        dto.setBairro(model.getBairro());
        dto.setCidade(model.getCidade());
        dto.setNumero(model.getNumero());
        dto.setUf(model.getUf());
        dto.setDdd(model.getDdd());
        return dto;
    }
}
