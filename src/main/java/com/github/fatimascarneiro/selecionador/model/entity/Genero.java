package com.github.fatimascarneiro.selecionador.model.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Genero {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String descricao;

    @ManyToMany
    @JoinTable(name = "genero_filme",
        joinColumns = {@JoinColumn(name = "genero_id")},
        inverseJoinColumns = {@JoinColumn(name = "filmes_id")})
    private Set<Filme> filmes;

    @ManyToMany
    @JoinTable(name = "genero_serie",
        joinColumns = {@JoinColumn(name = "genero_id")},
        inverseJoinColumns = {@JoinColumn(name = "series_id")})
    private Set<Serie> series;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Genero)) {
            return false;
        }
        Genero genero = (Genero) o;
        return id == genero.id &&
               Objects.equals(descricao, genero.descricao) &&
               Objects.equals(filmes, genero.filmes) &&
               Objects.equals(series, genero.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, filmes, series);
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Filme> getFilmes() {
        return filmes;
    }

    public Set<Serie> getSeries() {
        return series;
    }
}
