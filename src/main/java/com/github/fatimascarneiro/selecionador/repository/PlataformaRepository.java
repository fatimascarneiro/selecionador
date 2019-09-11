package com.github.fatimascarneiro.selecionador.repository;

import com.github.fatimascarneiro.selecionador.model.Plataforma;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma, Integer> {

}