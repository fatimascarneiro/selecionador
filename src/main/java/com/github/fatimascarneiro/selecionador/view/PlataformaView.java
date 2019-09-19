package com.github.fatimascarneiro.selecionador.view;

import java.util.List;

public class PlataformaView {
    private String nome;
    private List<SerieView> series;
    private List<FilmeView> filmes;

    public String getNome() {
        return nome;
    }

    public List<SerieView> getSeries() {
        return series;
    }

    public List<FilmeView> getFilmes() {
        return filmes;
    }
}
