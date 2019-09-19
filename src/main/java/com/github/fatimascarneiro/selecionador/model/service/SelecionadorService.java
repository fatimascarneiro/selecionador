package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.PlataformaException;
import com.github.fatimascarneiro.selecionador.model.entity.Filme;
import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;
import com.github.fatimascarneiro.selecionador.model.entity.Serie;

import java.time.Year;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

//TODO: NOS MÉTODOS QUE CONFEREM SE EXISTE UM ELEMENTO E FAZEM BUSCA, TROCAR OS TIPOS DOS OBJETOS POR TIPOS REPOSITORY APÓS MUDAR O BANCO DE DADOS;

public class SelecionadorService {

    private Set<Plataforma> plataformas = new HashSet<Plataforma>();
    private Plataforma plataforma;
    private Set<Serie> series = new HashSet<>();
    private Set<Filme> filmes = new HashSet<>();

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

    private Optional<Serie> selecionaSerieAleatóriaDaPlataforma(Plataforma plataforma) {
        Collections
            .shuffle(plataforma.getSeries());

        return plataforma
            .getSeries()
            .stream()
            .findFirst();
    }

    private Optional<Filme> selecionaFilmeAleatórioDaPlataforma(Plataforma plataforma) {
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
        coletaTodasAsSeriesDeUmaPlataforma(plataforma);

        series.stream()
            .filter(s -> serie.getProdutor().equals(produtor))
            .map(s -> serie.getProdutor());

        return series;
    }

    private Set<Filme> buscaFilmePorDiretor(String diretor) {
        coletaTodosOsFilmesDeUmaPlataforma(plataforma);

        filmes.stream()
            .filter(f -> filme.getDiretor().equals(diretor))
            .map(f -> filme.getDiretor());

        return filmes;
    }

    private Set<Filme> buscaFilmePorAno(Year ano) {
        coletaTodosOsFilmesDeUmaPlataforma(plataforma);

        filmes.stream()
            .filter(f -> filme.getAno().equals(ano))
            .map(f -> filme.getAno());

        return filmes;
    }

    private Set<Serie> buscaSeriePorGenero(Genero genero) {
        coletaTodasAsSeriesDeUmaPlataforma(plataforma);

        series.stream()
            .filter(s -> serie.getGeneros().equals(genero))
            .map(s -> serie.getGeneros());

        return series;
    }

    private Set<Filme> buscaFilmePorGenero(Genero genero) {
        coletaTodosOsFilmesDeUmaPlataforma(plataforma);

        filmes.stream()
            .filter(s -> filme.getGeneros().equals(genero))
            .map(s -> filme.getGeneros());

        return filmes;
    }
}
