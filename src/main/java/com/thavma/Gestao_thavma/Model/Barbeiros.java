package com.thavma.Gestao_thavma.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Barbeiros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_barbeiro")
    private Long idBarbeiro;

    @Column(name = "nome_barbeiro")
    private String nome;

    @Email
    @Column(name = "email_barbeiro", unique = true)
    private String email;

    @CPF
    @Column(name = "cpf_barbeiro", unique = true)
    private String cpf;

    @OneToMany(mappedBy = "barbeiro")
    private List<Atendimento> atendimentos;
}

