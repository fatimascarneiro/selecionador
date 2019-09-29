package com.github.fatimascarneiro.selecionador.view;

import com.github.fatimascarneiro.selecionador.model.entity.Filme;
import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.model.entity.Serie;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneroView {
    private String descricao;
    private Set<Filme> filmes;
    private Set<Serie> series;

    public String getDescricao() {
        return descricao;
    }

    public Set<Filme> getFilmes() {
        return filmes;
    }

    public Set<Serie> getSeries() {
        return series;
    }

    public GeneroView(Genero genero) {
        this.descricao = genero.getDescricao();
        this.filmes = genero.getFilmes();
        this.series = genero.getSeries();
    }

    public static List<GeneroView> from(List<Genero> generos) {
        return generos
                .stream()
                .map(GeneroView::new)
                .collect(Collectors.toList());

    }
}
