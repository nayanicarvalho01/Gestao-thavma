package com.thavma.Gestao_thavma.Repository;

import com.thavma.Gestao_thavma.Model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository <Clientes, Long> {
    Clientes findByTelefone(String telefone);
}
