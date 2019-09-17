package com.github.fatimascarneiro.selecionador.repository;

import com.github.fatimascarneiro.selecionador.model.Plataforma;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformaRepository extends CrudRepository<Plataforma, Integer> {

}