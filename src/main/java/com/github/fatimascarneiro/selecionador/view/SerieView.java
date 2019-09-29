package com.github.fatimascarneiro.selecionador.view;

import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.model.entity.Serie;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SerieView {

    private String nome;
    private String produtor;
    //todo: fazer genero view/
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

    public SerieView(Serie serie) {
        this.nome = serie.getNome();
        this.produtor = serie.getProdutor();
        this.generos = serie.getGeneros();
    }

    public static List<SerieView> from(List<Serie> series) {
        return series
            .stream()
            .map(SerieView::new)
            .collect(Collectors.toList());

    }
}
