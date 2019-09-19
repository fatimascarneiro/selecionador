package com.github.fatimascarneiro.selecionador.model;

import com.github.fatimascarneiro.selecionador.exception.GeneroException;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Genero {

    @Id
    @GeneratedValue
    private int id;

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

    private void plataformaSemNome() throws GeneroException {
        if (descricao.isEmpty()) {
            throw new GeneroException("É necessário informar qual a descrição do gênero.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
