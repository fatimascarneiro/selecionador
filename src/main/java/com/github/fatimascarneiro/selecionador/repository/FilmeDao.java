package com.github.fatimascarneiro.selecionador.repository;

import com.github.fatimascarneiro.selecionador.model.entity.Filme;
import com.github.fatimascarneiro.selecionador.model.entity.Genero;

import java.time.Year;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class FilmeDao implements FilmeRepository{
    private Set<Filme> filmes;

    private Set<Filme> buscaFilmePorDiretor(String diretor) {
        filmes.stream()
                .filter(f -> f.getDiretor().equals(diretor))
                .map(f -> f.getDiretor());

        return filmes;
    }

    private Set<Filme> buscaFilmePorAno(Year ano) {
        filmes.stream()
                .filter(f -> f.getAno().equals(ano))
                .map(f -> f.getAno());

        return filmes;
    }

    private Set<Filme> buscaFilmePorGenero(Genero genero) {
        return filmes.stream()
                .filter(s -> s.getGeneros().contains(genero))
                .collect(Collectors.toSet());
    }

    @Override
    public <S extends Filme> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Filme> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Filme> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Filme> findAll() {
        return null;
    }

    @Override
    public Iterable<Filme> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Filme entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Filme> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
