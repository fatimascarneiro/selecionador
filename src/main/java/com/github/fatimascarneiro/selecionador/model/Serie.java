package com.github.fatimascarneiro.selecionador.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Serie {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String produtor;

    @ManyToMany(mappedBy = "series")
    private Set<Genero> generos;

    public Serie(String nome, Set<Genero> generos) {
        this.nome = nome;
        this.generos = generos;
    }

    public String getNome() {
        return nome;
    }

}
