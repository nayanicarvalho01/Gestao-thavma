package com.thavma.Gestao_thavma.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_servico")
    private Long idServico;

    @Column(name = "nome_servico")
    private String nomeServico;

    @Column(name = "preco_servico")
    private Double precoServico;

    @ManyToMany(mappedBy = "servico")
    private List<Atendimento> atendimento;
}
