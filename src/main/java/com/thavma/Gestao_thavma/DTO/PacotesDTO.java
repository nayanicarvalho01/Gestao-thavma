package com.thavma.Gestao_thavma.DTO;

import java.time.LocalDateTime;

public record PacotesDTO (Long idPacote, String tipoDoPacote, Double precoPacote, LocalDateTime dataContratacao, Integer frequenciaMensal) {
}
