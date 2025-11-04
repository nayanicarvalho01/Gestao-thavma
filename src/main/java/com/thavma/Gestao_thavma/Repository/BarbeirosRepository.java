package com.thavma.Gestao_thavma.Repository;

import com.thavma.Gestao_thavma.Model.Barbeiros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarbeirosRepository extends JpaRepository <Barbeiros, Long> {
    Barbeiros findByCpf(String cpf);
}
