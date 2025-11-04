package com.thavma.Gestao_thavma.DTO;

public record AtendimentoRequestDTO(Long idAtendimento, String tipoAtendimento, Boolean servicoCobrado, Long idBarbeiro, Long idCliente, Long idTransacao, Long idPacote) {
}
