package com.github.fatimascarneiro.selecionador.model.entity;

import java.time.Year;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Filme {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String nome;

    private String diretor;

    private Year ano;

    @NotNull
    @ManyToMany(mappedBy = "filmes")
    private Set<Genero> generos;

    public Filme(String nome, String diretor, Year ano, Set<Genero> generos) {
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.generos = generos;
    }

    public Filme() {
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public String getDiretor() {
        return diretor;
    }

    public Year getAno() {
        return ano;
    }
}
