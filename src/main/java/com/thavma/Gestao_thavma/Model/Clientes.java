package com.thavma.Gestao_thavma.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "nome_cliente")
    private String nome;

    @Email
    @Column(name = "email_cliente", unique = true)
    private String email;

    @Column(unique = true)
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    private List<Atendimento> atendimento;

    @ManyToOne
    @JoinColumn(name = "id_pacote")
    private Pacotes pacote;

}
