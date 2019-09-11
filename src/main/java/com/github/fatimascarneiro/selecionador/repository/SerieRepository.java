package com.github.fatimascarneiro.selecionador.repository;

import com.github.fatimascarneiro.selecionador.model.Serie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {

}
