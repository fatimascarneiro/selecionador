package com.github.fatimascarneiro.selecionador.repository;

import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.model.entity.Serie;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SerieDao implements SerieRepository {
    private Set<Serie> series;

    public Set<Serie> buscaSeriePorProdutor(String produtor) {

        return series.stream()
                .filter(s -> s.getProdutor().contains(produtor))
                .collect(Collectors.toSet());
    }

    public Set<Serie> buscaSeriePorGenero(Genero genero) {
        return series.stream()
                .filter(s -> s.getGeneros().contains(genero))
                .collect(Collectors.toSet());
    }

    @Override
    public <S extends Serie> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Serie> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Serie> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Serie> findAll() {
        return null;
    }

    @Override
    public Iterable<Serie> findAllById(Iterable<Long> longs) {
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
    public void delete(Serie entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Serie> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
