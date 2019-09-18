package com.github.fatimascarneiro.selecionador.model;

import com.github.fatimascarneiro.selecionador.repository.FilmeRepository;
import com.github.fatimascarneiro.selecionador.repository.GeneroRepository;
import com.github.fatimascarneiro.selecionador.repository.PlataformaRepository;
import com.github.fatimascarneiro.selecionador.repository.SerieRepository;

import java.time.Year;
import java.util.Set;

public class SelecionadorService {
    private Plataforma plataforma;
    private Genero genero;
    private Serie serie;
    private Filme filme;
    private PlataformaRepository plataformaRepository;
    private GeneroRepository generoRepository;
    private SerieRepository serieRepository;
    private FilmeRepository filmeRepository;
    //TODO só para compilar. É necessário pegar o set de generos (e as outras informações) do InsereNoBanco
    private Set<Genero> generos;

    private Plataforma buscarPlataforma() {
        plataforma = new Plataforma();
        plataformaRepository.findById(plataforma.getId());

        return plataforma;
    }

    private Genero buscarGenero() {
        genero = new Genero();
        generoRepository.findById(genero.getId());

        return genero;
    }

    private Serie buscarSerie() {
        serie = new Serie("", generos);
        serieRepository.findById(serie.getId());

        return serie;
    }

    private Filme buscarFilme() {
        filme = new Filme("", "", Year.of(1), generos);
        filmeRepository.findById(filme.getId());

        return filme;
    }


}
