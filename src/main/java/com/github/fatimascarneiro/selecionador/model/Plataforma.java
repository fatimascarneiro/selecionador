package com.github.fatimascarneiro.selecionador.model;

import com.github.fatimascarneiro.selecionador.exception.PlataformaException;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Plataforma {

    @Id
    @GeneratedValue
    private int id;

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

    private void plataformaSemNome() throws PlataformaException {
        if (nome.isEmpty()) {
            throw new PlataformaException("A plataforma precisa ter um nome.");
        }
    }
}
