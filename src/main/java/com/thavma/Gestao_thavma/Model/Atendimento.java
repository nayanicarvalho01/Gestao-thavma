package com.thavma.Gestao_thavma.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Atendimento{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_atendimento")
    private Long idAtendimento;

    @Column(name = "tipo_atendimento")
    private String tipoAtendimento;

    @Column(name = "servico_cobrado")
    private Boolean servicoCobrado;

    @Column(name = "data_hora")
    private LocalDateTime dataHora = LocalDateTime.now();

    // Muitos atendimentos podem ser feitos por 1 barbeiro
    @ManyToOne
    @JoinColumn(name = "id_barbeiro", nullable = false)
    private Barbeiros barbeiro;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Clientes cliente;

    // Se o atendimento gerou uma transação (pagamento), fica registrado aqui
    @ManyToOne
    @JoinColumn(name = "id_transacao")
    private Transacao transacao;

    // Caso o atendimento seja parte de um pacote
    @ManyToOne
    @JoinColumn(name = "id_pacote")
    private Pacotes pacote;

    @ManyToMany
    @JoinTable(
            name = "atendimento_produto",
            joinColumns = @JoinColumn(name = "id_atendimento"),
            inverseJoinColumns = @JoinColumn(name = "id_produto")
    )
    private List<Produto> produto;

    @ManyToMany
    @JoinTable(
            name = "atendimento_servico",
            joinColumns = @JoinColumn(name = "id_atendimento"),
            inverseJoinColumns = @JoinColumn(name = "id_servico")
    )
    private List<Servico> servico;
}
