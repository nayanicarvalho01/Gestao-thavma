package com.thavma.Gestao_thavma.Service;

import com.thavma.Gestao_thavma.DTO.AtendimentoRequestDTO;
import com.thavma.Gestao_thavma.DTO.ClienteResponseDTO;
import com.thavma.Gestao_thavma.Exceptions.ResourceNotFoundException;
import com.thavma.Gestao_thavma.Model.Clientes;
import com.thavma.Gestao_thavma.Repository.ClientesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClientesRepository clienteRepository;

    public ClienteService(ClientesRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteResponseDTO cadastrarCliente(AtendimentoRequestDTO dto) {
        Clientes cliente = new Clientes();
        cliente.setNome(dto.nome());
        cliente.setEmail(dto.email());
        cliente.setTelefone(dto.telefone());
        return clienteRepository.save(cliente);
    }

    public ClienteResponseDTO buscarPorTelefone(String telefone) {
        Clientes cliente = clienteRepository.findByTelefone(telefone);
        if (cliente == null) {
            throw new ResourceNotFoundException("Cliente com telefone " + telefone + " não encontrado.");
        }
        return cliente;
    }

    public List<ClienteResponseDTO> listarTodosClientes() {
        return clienteRepository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .toList();
    }

    public ClienteResponseDTO toResponseDTO(Clientes cliente) {
        return new ClienteResponseDTO(
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getTelefone()
        );
    }
}
