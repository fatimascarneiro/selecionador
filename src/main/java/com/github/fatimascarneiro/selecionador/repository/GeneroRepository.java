package com.github.fatimascarneiro.selecionador.repository;

import com.github.fatimascarneiro.selecionador.model.Genero;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {

}
