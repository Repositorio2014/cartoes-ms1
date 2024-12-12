package br.com.cartoes_ms1.dto;

import br.com.cartoes_ms1.model.Cliente;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ClienteDto {
    private long id;
    private String name;
    private String email;
    private String cpf;
    private String telefone;

    private EnderecoDto endereco;

    public static ClienteDto convert(Cliente model) {
        ClienteDto dto = new ClienteDto();
        EnderecoDto enderecoDto = new EnderecoDto();

        dto.setId(model.getId());
        dto.setName(model.getName());
        dto.setEmail(model.getEmail());
        dto.setCpf(model.getCpf());
        dto.setTelefone(model.getTelefone());
        if (model.getEndereco().getId() != null) {
            enderecoDto.setId(model.getEndereco().getId());
            enderecoDto.setLogradouro(model.getEndereco().getLogradouro());
            enderecoDto.setBairro(model.getEndereco().getBairro());
            enderecoDto.setNumero(model.getEndereco().getNumero());
            enderecoDto.setCidade(model.getEndereco().getCidade());
            enderecoDto.setUf(model.getEndereco().getUf());
            enderecoDto.setDdd(model.getEndereco().getDdd());
            dto.setEndereco(enderecoDto);
        }
        return dto;
    }
}
