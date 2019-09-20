package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.PlataformaException;
import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;

import java.util.HashSet;
import java.util.Set;

/**
 * Responsiblidade: a partir de uma plataforma, ou todas, algum filtro de filme ou série, deve selecionar apenas um Filme ou Série.
 */
public class SelecionadorService {

    private Set<Plataforma> plataformas = new HashSet<Plataforma>();

    private void confereSePossuiPlataforma() {
        if (plataformas.isEmpty()) {
            throw new PlataformaException("Não existe plataforma cadastrada.");
        }
    }
}
