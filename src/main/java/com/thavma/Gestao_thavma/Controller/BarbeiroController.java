package com.thavma.Gestao_thavma.Controller;

import com.thavma.Gestao_thavma.DTO.BarbeiroRequestDTO;
import com.thavma.Gestao_thavma.DTO.BarbeiroResponseDTO;
import com.thavma.Gestao_thavma.Service.BarbeiroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/barbeiros")
@AllArgsConstructor

public class BarbeiroController {

    private final BarbeiroService barbeiroService;

    @PostMapping
    public BarbeiroResponseDTO cadastrarBarbeiro(@RequestBody BarbeiroRequestDTO dto) {
        return barbeiroService.cadastrarBarbeiro(dto);
    }

    @GetMapping("/buscarPorCpf{cpf}")
    public BarbeiroResponseDTO buscarPorCpf(@RequestParam String cpf) {
        return barbeiroService.buscarPorCpf(cpf);
    }

}
