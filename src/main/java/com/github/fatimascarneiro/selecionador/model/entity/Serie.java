package com.github.fatimascarneiro.selecionador.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Serie {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String nome;

    private String produtor;

    @NotNull
    @ManyToMany(mappedBy = "series")
    private Set<Genero> generos;

    public Serie(String nome, Set<Genero> generos) {
        this.nome = nome;
        this.generos = generos;
    }

    public Serie() {
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

    public void setGeneros(Set<Genero> generos) {
        this.generos = generos;
    }
}
