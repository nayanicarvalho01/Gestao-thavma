package com.thavma.Gestao_thavma.Exceptions;

public record ErrorResponseDTO(String message, int status, String timestamp, String path) {
}
