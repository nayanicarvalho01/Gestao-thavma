package com.thavma.Gestao_thavma.DTO;

import java.time.LocalDateTime;

public record AtendimentoResponseDTO(String tipoAtendimento, Boolean servicoCobrado, Long idTransacao, LocalDateTime dataHora) {
}
