package com.github.fatimascarneiro.selecionador;

import com.github.fatimascarneiro.selecionador.repository.FilmeRepository;
import com.github.fatimascarneiro.selecionador.repository.GeneroRepository;
import com.github.fatimascarneiro.selecionador.repository.PlataformaRepository;
import com.github.fatimascarneiro.selecionador.repository.SerieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CaraQueInsere implements CommandLineRunner {

    private SerieRepository serieRepository;
    private FilmeRepository filmeRepository;
    private GeneroRepository generoRepository;
    private PlataformaRepository plataformaRepository;

    @Autowired
    public CaraQueInsere(SerieRepository serieRepository,
                         FilmeRepository filmeRepository,
                         GeneroRepository generoRepository,
                         PlataformaRepository plataformaRepository) {
        this.serieRepository = serieRepository;
        this.filmeRepository = filmeRepository;
        this.generoRepository = generoRepository;
        this.plataformaRepository = plataformaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        new Filme("Grey's Anathomy", Genero.DRAMA)
//        new Filme("Orange Is The New Black", Genero.DRAMA)
//        new Filme("Hora de Aventura", Genero.ANIMACAO)
//        new Filme("The Good Place", Genero.COMEDIA)
//        new Filme("One Day At a Time", Genero.FAMILIA)
//        new Filme("Up - Altas Aventuras", Genero.ANIMACAO)
//        new Filme("Senhor dos Anéis", Genero.AVENTURA)
//        new Filme("Matrix", Genero.ACAO)
//        new Filme("Titanic", Genero.ROMANCE)
//
//        new Serie("Todo Mundo odeia o Cris", Genero.COMEDIA)
//        new Serie("As Visões da Raven", Genero.COMEDIA)
//        new Serie("Um Maluco no Pedaço", Genero.COMEDIA)
//        new Serie("Phineas e Ferb", Genero.ANIMACAO)
//        new Serie("Hora de Aventura", Genero.ANIMACAO)
//        new Serie("The Good Place", Genero.COMEDIA)
//        new Serie("One Day At a Time", Genero.FAMILIA)
//        new Serie("Grey's Anathomy", Genero.DRAMA)
//        new Serie("Brooklyn 99", Genero.COMEDIA)
//
//        new Plataforma("Popcorn Time", 3);
    }
}
