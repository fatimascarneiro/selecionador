package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.PlataformaException;
import com.github.fatimascarneiro.selecionador.model.entity.Filme;
import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;
import com.github.fatimascarneiro.selecionador.model.entity.Serie;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO: NOS MÉTODOS QUE CONFEREM SE EXISTE UM ELEMENTO E FAZEM BUSCA, TROCAR OS TIPOS DOS OBJETOS POR TIPOS REPOSITORY APÓS MUDAR O BANCO DE DADOS;
 * <p>
 * Responsiblidade: a partir de uma plataforma, ou todas, algum filtro de filme ou série, deve selecionar apenas um Filme ou Série.
 */
public class SelecionadorService {

    private Set<Plataforma> plataformas = new HashSet<Plataforma>();
    private Plataforma plataforma;
    private Set<Serie> series = new HashSet<>();
    private Set<Filme> filmes = new HashSet<>();

    private Serie serie;
    private Filme filme;

    private void confereSePossuiPlataforma() {
        if (plataformas.isEmpty()) {
            throw new PlataformaException("Não existe plataforma cadastrada.");
        }
    }

    private void confereSePossuiFilmeNaPlataforma() {
        if (plataforma.naoTemFilmes()) {
            throw new PlataformaException("Não é possível selecionar um elemento dessa plataforma porque ela está vazia.");
        }
    }

    private void confereSePossuiSerieNaPlataforma() {
        if (plataforma.getSeries().isEmpty()) {
            throw new PlataformaException("Não é possível selecionar um elemento dessa plataforma porque ela está vazia.");
        }
    }

    private Plataforma buscaPlataformaPeloNome(String nomeDeUmaPlataforma) {
        confereSePossuiPlataforma();

        plataformas
            .stream()
            .filter(p -> equals(plataforma.getNome()))
            .findFirst();

        return plataforma;
    }

    private Optional<Serie> selecionaSerieAleatóriaDaPlataforma(Plataforma plataforma) {
        confereSePossuiSerieNaPlataforma();

        Collections
            .shuffle(plataforma.getSeries());

        return plataforma
            .getSeries()
            .stream()
            .findFirst();
    }

    private Optional<Filme> selecionaFilmeAleatórioDaPlataforma(Plataforma plataforma) {
        confereSePossuiFilmeNaPlataforma();

        Collections
            .shuffle(plataforma.getFilmes());

        return plataforma
            .getFilmes()
            .stream()
            .findFirst();
    }

    private Set<Serie> coletaTodasAsSeriesDeUmaPlataforma(Plataforma plataforma) {
        plataforma.getSeries().addAll(series);
        return series;
    }

    private Set<Filme> coletaTodosOsFilmesDeUmaPlataforma(Plataforma plataforma) {
        plataforma.getFilmes().addAll(filmes);
        return filmes;
    }

    private Set<Serie> buscaSeriePorProdutor(String produtor) {
        Set<Serie> series = coletaTodasAsSeriesDeUmaPlataforma(plataforma);

        return series.stream()
            .filter(s -> s.getProdutor().contains(produtor))
            .collect(Collectors.toSet());
    }


    private Set<Filme> buscaFilmePorDiretor(String diretor) {
        coletaTodosOsFilmesDeUmaPlataforma(plataforma);

        filmes.stream()
            .filter(f -> filme.getDiretor().equals(diretor))
            .map(f -> filme.getDiretor());

        return filmes;
    }
//TODO: arrumar
//    private Set<Filme> buscaFilmePorAno(Year ano) {
//        coletaTodosOsFilmesDeUmaPlataforma(plataforma);
//
//        filmes.stream()
//            .filter(f -> filme.getAno().equals(ano))
//            .map(f -> filme.getAno());
//
//        return filmes;
//    }

    private Set<Serie> buscaSeriePorGenero(Genero genero) {
        Set<Serie> series = coletaTodasAsSeriesDeUmaPlataforma(plataforma);

        return series.stream()
            .filter(s -> s.getGeneros().contains(genero))
            .collect(Collectors.toSet());
    }

    private Set<Filme> buscaFilmePorGenero(Genero genero) {
        Set<Filme> filmes = coletaTodosOsFilmesDeUmaPlataforma(plataforma);

        return filmes.stream()
            .filter(s -> s.getGeneros().contains(genero))
            .collect(Collectors.toSet());
    }
}
