package com.thavma.Gestao_thavma.Repository;

import com.thavma.Gestao_thavma.Model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository <Transacao, Long> {
}
