package com.thavma.Gestao_thavma.Controller;

import com.thavma.Gestao_thavma.DTO.ClienteRequestDTO;
import com.thavma.Gestao_thavma.DTO.ClienteResponseDTO;
import com.thavma.Gestao_thavma.Service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor

public class ClienteController {
    private final ClienteService clienteService;

    @PostMapping
    public ClienteResponseDTO cadastrarCliente(@RequestBody ClienteRequestDTO dto) {
        return clienteService.cadastrarCliente(dto);
    }

    @GetMapping("/buscarPorTelefone/{telefone}")
    public ClienteResponseDTO buscarPorTelefone(@PathVariable String telefone) {
        return clienteService.buscarPorTelefone(telefone);
    }

    @GetMapping("/listarTodos")
    public List<ClienteResponseDTO> listarTodosClientes() {
        return clienteService.listarTodosClientes();
    }
}