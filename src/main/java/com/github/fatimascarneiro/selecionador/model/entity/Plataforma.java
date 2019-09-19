package com.github.fatimascarneiro.selecionador.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Plataforma {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String nome;

    @ManyToMany
    @JoinTable(name = "plataforma_serie",
        joinColumns = {@JoinColumn(name = "plataforma_id")},
        inverseJoinColumns = {@JoinColumn(name = "serie_id")})
    private List<Serie> series;

    @ManyToMany
    @JoinTable(name = "plataforma_filme",
        joinColumns = {@JoinColumn(name = "platafomorma_id")},
        inverseJoinColumns = {@JoinColumn(name = "filme_id")})
    private List<Filme> filmes;


    public Plataforma(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Plataforma() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}
