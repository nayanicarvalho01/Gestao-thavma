package com.thavma.Gestao_thavma.DTO;

public record TransacaoDTO(Long idTransacao, String formaPagamento, Double valorTotal, String dataHora) {
}
