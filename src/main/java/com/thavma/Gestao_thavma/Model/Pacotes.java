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
@AllArgsConstructor
@NoArgsConstructor

public class Pacotes {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long idPacote;

    @Column(name = "tipo_pacote")
    private String tipoDoPacote;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "data_contratacao")
    private LocalDateTime dataContratacao = LocalDateTime.now();

    private LocalDateTime validade = dataContratacao.plusMonths(1);

    @Column(name = "frequencia_mensal")
    private Integer FrequenciaMensal;

    @OneToMany(mappedBy = "pacote")
    private List<Clientes> cliente;

    @OneToMany(mappedBy = "pacote")
    private List<Atendimento> atendimentos;

}
