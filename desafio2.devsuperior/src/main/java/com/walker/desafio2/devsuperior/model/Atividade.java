package com.walker.desafio2.devsuperior.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "atividade")
    private List<Bloco> blocos;

    @ManyToMany(mappedBy = "atividades")
    private List<Participante> participantes;
}
