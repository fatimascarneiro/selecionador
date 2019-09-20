package com.github.fatimascarneiro.selecionador.view;

import com.github.fatimascarneiro.selecionador.model.entity.Genero;

import java.time.Year;
import java.util.Set;

public class FilmeView {
    private String nome;

    private String diretor;

    private Year ano;

    private Set<Genero> generos;

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public Year getAno() {
        return ano;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(Set<Genero> generos) {
        this.generos = generos;
    }
}
