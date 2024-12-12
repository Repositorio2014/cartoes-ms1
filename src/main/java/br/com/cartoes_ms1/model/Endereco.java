package br.com.cartoes_ms1.model;

import br.com.cartoes_ms1.dto.EnderecoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private int numero;
    private String uf;
    private String ddd;

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

    public static Endereco convert(EnderecoDto dto){
        Endereco model = new Endereco();

        model.setId(dto.getId());
        model.setCep(dto.getCep());
        model.setLogradouro(dto.getLogradouro());
        model.setComplemento(dto.getComplemento());
        model.setBairro(dto.getBairro());
        model.setCidade(dto.getCidade());
        model.setNumero(dto.getNumero());
        model.setUf(dto.getUf());
        model.setDdd(dto.getDdd());
        return model;
    }
}
