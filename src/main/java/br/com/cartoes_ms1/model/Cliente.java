package br.com.cartoes_ms1.model;

import br.com.cartoes_ms1.dto.ClienteDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String cpf;
    private String telefone;

    @OneToOne
    private Endereco endereco;

    public static Cliente convert(ClienteDto cliente){
        Cliente clienteModel = new Cliente();

        clienteModel.setId(cliente.getId());
        clienteModel.setName(cliente.getName());
        clienteModel.setTelefone(cliente.getTelefone());
        clienteModel.setEmail(cliente.getEmail());
        cliente.setEndereco(cliente.getEndereco());

        return clienteModel;
    }
}
