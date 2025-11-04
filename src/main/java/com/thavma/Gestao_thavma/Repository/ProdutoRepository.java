package com.thavma.Gestao_thavma.Repository;

import com.thavma.Gestao_thavma.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
}
