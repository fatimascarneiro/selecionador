package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.SerieExpection;
import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.model.entity.Serie;
import com.github.fatimascarneiro.selecionador.repository.SerieRepository;

import java.util.Set;

public class SerieService {

    private Serie serie;
    private Set<Genero> generos;
    private SerieRepository serieRepository;

    private void serieSemNome() throws SerieExpection {
        if (serie.getNome().isEmpty()) {
            throw new SerieExpection("É necessário informar qual o nome da série.");
        }
    }

    private void seriePrecisaTerGenero() throws SerieExpection {
        if (serie.getGeneros().isEmpty()) {
            throw new SerieExpection("Uma série precisa ter pelo menos um gênero.");
        }
    }

    private Serie buscarSerie() {
        serie = new Serie("", generos);
        serieRepository.findById(serie.getId());

        return serie;
    }
}
