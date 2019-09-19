package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.PlataformaException;
import com.github.fatimascarneiro.selecionador.model.entity.Filme;
import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;
import com.github.fatimascarneiro.selecionador.model.entity.Serie;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

//TODO: NOS MÉTODOS QUE CONFEREM SE EXISTE UM ELEMENTO E FAZEM BUSCA, TROCAR OS TIPOS DOS OBJETOS POR TIPOS REPOSITORY APÓS MUDAR O BANCO DE DADOS;

public class SelecionadorService {

    private Set<Plataforma> plataformas = new HashSet<Plataforma>();
    private Plataforma plataforma;

    private Serie serie;
    private Filme filme;

    private void confereSePossuiElementoNaPlataforma() throws PlataformaException {
        if (plataformas.isEmpty()) {
            throw new PlataformaException("Não é possível selecionar um elemento dessa plataforma porque ela está vazia.");
        }
    }

    private Plataforma buscaPlataformaPeloNome(String nomeDeUmaPlataforma) {
        confereSePossuiElementoNaPlataforma();

        plataformas
            .stream()
            .filter(p -> equals(plataforma.getNome()))
            .findFirst();

        return plataforma;
    }

    private Optional<Serie> buscaSerieAleatóriaDaPlataforma(Plataforma plataforma) {
        Collections
            .shuffle(plataforma.getSeries());

        return plataforma
            .getSeries()
            .stream()
            .findFirst();
    }

    private Optional<Filme> buscaFilmeAleatórioDaPlataforma(Plataforma plataforma) {
        Collections
            .shuffle(plataforma.getFilmes());

        return plataforma
            .getFilmes()
            .stream()
            .findFirst();
    }
}
