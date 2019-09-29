package com.github.fatimascarneiro.selecionador.repository;

import com.github.fatimascarneiro.selecionador.model.entity.Genero;
import com.github.fatimascarneiro.selecionador.model.entity.Serie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.stream.Collectors;

@Repository
public interface SerieRepository extends CrudRepository<Serie, Long> {
    Set<Serie> buscaSeriePorProdutor(String produtor);

    Set<Serie> buscaSeriePorGenero(Genero genero);
}
