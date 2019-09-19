package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.PlataformaException;
import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;
import com.github.fatimascarneiro.selecionador.repository.PlataformaRepository;

public class PlataformaService {

    private Plataforma plataforma;

    private PlataformaRepository plataformaRepository;

    private void plataformaSemNome() throws PlataformaException {
        if (plataforma.getNome().isEmpty()) {
            throw new PlataformaException("A plataforma precisa ter um nome.");
        }
    }

    private Plataforma buscarPlataforma() {
        plataforma = new Plataforma();
        plataformaRepository.findById(plataforma.getId());

        return plataforma;
    }
}
