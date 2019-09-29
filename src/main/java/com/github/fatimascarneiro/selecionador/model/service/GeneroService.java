package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.GeneroException;
import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.repository.GeneroRepository;

public class GeneroService {

    private Genero genero;
    private GeneroRepository generoRepository;

    private void generoSemNome() throws GeneroException {
        if (genero.getDescricao().isEmpty()) {
            throw new GeneroException("É necessário informar qual a descrição do gênero.");
        }
    }

    private Genero buscarGenero() {
        genero = new Genero();
        generoRepository.findById(genero.getId());

        return genero;
    }

}
