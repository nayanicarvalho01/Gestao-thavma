package com.thavma.Gestao_thavma.Service;

import com.thavma.Gestao_thavma.DTO.BarbeiroRequestDTO;
import com.thavma.Gestao_thavma.DTO.BarbeiroResponseDTO;
import com.thavma.Gestao_thavma.Exceptions.ResourceNotFoundException;
import com.thavma.Gestao_thavma.Model.Barbeiros;
import com.thavma.Gestao_thavma.Repository.BarbeirosRepository;
import org.springframework.stereotype.Service;

@Service
public class BarbeiroService {

    private final BarbeirosRepository barbeirosRepository;

    public BarbeiroService(BarbeirosRepository barbeirosRepository) {
        this.barbeirosRepository = barbeirosRepository;
    }

    public BarbeiroResponseDTO cadastrarBarbeiro(BarbeiroRequestDTO dto){

        Barbeiros barbeiro = new Barbeiros();
        barbeiro.setNome(dto.nome());
        barbeiro.setEmail(dto.email());
        barbeiro.setCpf(dto.cpf());
        Barbeiros barbeiroCadastrado = barbeirosRepository.save(barbeiro);

        return toResponseDTO(barbeiroCadastrado);
    }

    public BarbeiroResponseDTO buscarPorCpf(String cpf){
        Barbeiros barbeiro = barbeirosRepository.findByCpf(cpf);
        if (barbeiro == null) {
            throw new ResourceNotFoundException("Barbeiro com CPF " + cpf + " não encontrado.");
        }
        return toResponseDTO(barbeiro);
    }

    public BarbeiroResponseDTO toResponseDTO(Barbeiros barbeiro){
        return new BarbeiroResponseDTO(
                barbeiro.getNome(),
                barbeiro.getEmail(),
                barbeiro.getCpf()
        );
    }
}
