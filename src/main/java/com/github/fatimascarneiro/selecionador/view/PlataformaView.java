package com.github.fatimascarneiro.selecionador.view;

import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;

import java.util.List;

public class PlataformaView  {
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

    public PlataformaView(Plataforma plataforma){
        this.nome = plataforma.getNome();
        this.series = SerieView.from(plataforma.getSeries());
        this.filmes = FilmeView.from(plataforma.getFilmes());
    }
}
