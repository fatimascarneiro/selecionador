package com.github.fatimascarneiro.selecionador.view;

import com.github.fatimascarneiro.selecionador.model.entity.Genero;

import java.util.Set;

public class SerieView {
    private String nome;
    private String produtor;
    private Set<Genero> generos;

    public String getNome() {
        return nome;
    }

    public String getProdutor() {
        return produtor;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }
}
