package com.github.fatimascarneiro.selecionador.repository;

import com.github.fatimascarneiro.selecionador.model.entity.Genero;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<Genero, Integer> {

}
