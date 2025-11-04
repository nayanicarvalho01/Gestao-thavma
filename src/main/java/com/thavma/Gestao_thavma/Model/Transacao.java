package com.thavma.Gestao_thavma.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_pagamento")
    private Long idPagamento;

    @Column(name = "forma_pagamento")
    private String formaPagamento;

    @Column(name = "valor_total")
    private Double valorTotal;

    @OneToMany(mappedBy = "transacao", cascade = CascadeType.PERSIST)
    private List<Atendimento> atendimento;



}
