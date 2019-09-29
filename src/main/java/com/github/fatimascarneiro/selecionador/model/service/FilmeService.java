package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.FilmeException;
import com.github.fatimascarneiro.selecionador.model.entity.Filme;
import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.repository.FilmeRepository;

import java.time.Year;
import java.util.Set;

public class FilmeService {

    private Filme filme;
    private Set<Genero> generos;
    private FilmeRepository filmeRepository;

    private void filmeSemNome() throws FilmeException {
        if (filme.getNome().isEmpty()) {
            throw new FilmeException("É necessário informar qual o nome do filme.");
        }
    }

    private void filmePrecisaTerGenero() throws FilmeException {
        if (filme.getGeneros().isEmpty()) {
            throw new FilmeException("Um filme precisa ter pelo menos um gênero.");
        }
    }

    private Filme buscarFilme() {
        filme = new Filme("", "", Year.of(1), generos);
        filmeRepository.findById(filme.getId());

        return filme;
    }
}
