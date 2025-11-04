package com.thavma.Gestao_thavma.Service;

import com.thavma.Gestao_thavma.DTO.ServicoDTO;
import com.thavma.Gestao_thavma.Model.Servico;
import com.thavma.Gestao_thavma.Repository.ServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicoService {

    private final ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public ServicoDTO cadastrarServico(ServicoDTO dto) {
        Servico servico = new Servico();
        servico.setNomeServico(dto.nomeServiço());
        servico.setPrecoServico(dto.preçoServiço());
        Servico servicoCadastrado = servicoRepository.save(servico);

        return toResponseDTO(servicoCadastrado);
    }

    public ServicoDTO atualizarServico(Long id, ServicoDTO dto) {
        Servico servicoExistente = servicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Serviço não encontrado com o ID: " + id));
        servicoExistente.setNomeServico(dto.nomeServiço());
        servicoExistente.setPrecoServico(dto.preçoServiço());

        return toResponseDTO(servicoRepository.save(servicoExistente));
    }

    public ServicoDTO toResponseDTO(Servico servico){
        return new ServicoDTO(
                servico.getIdServico(),
                servico.getNomeServico(),
                servico.getPrecoServico()
        );

    }

}
