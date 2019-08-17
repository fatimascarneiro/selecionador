package model.entity;

import java.util.List;

public class Plataforma {
    String nome;
    List<Filme> filmes;
    List<Serie> series;
    List todoCatalogoDaPlataforma;

    public List<Filme> getFilmes() {
        return filmes;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public List getTodoCatalogoDaPlataforma() {
        return todoCatalogoDaPlataforma;
    }
}
