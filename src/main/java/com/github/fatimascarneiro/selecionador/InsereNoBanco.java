package com.github.fatimascarneiro.selecionador;

import com.github.fatimascarneiro.selecionador.model.Filme;
import com.github.fatimascarneiro.selecionador.model.Genero;
import com.github.fatimascarneiro.selecionador.model.Plataforma;
import com.github.fatimascarneiro.selecionador.model.Serie;
import com.github.fatimascarneiro.selecionador.repository.FilmeRepository;
import com.github.fatimascarneiro.selecionador.repository.GeneroRepository;
import com.github.fatimascarneiro.selecionador.repository.PlataformaRepository;
import com.github.fatimascarneiro.selecionador.repository.SerieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

@Component
public class InsereNoBanco implements CommandLineRunner {

    private SerieRepository serieRepository;
    private FilmeRepository filmeRepository;
    private GeneroRepository generoRepository;
    private PlataformaRepository plataformaRepository;



    @Autowired
    public InsereNoBanco(SerieRepository serieRepository,
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
        Genero drama = new Genero();
        Genero comedia = new Genero();
        Genero romance = new Genero();
        Genero acao = new Genero();

        Set<Genero> generos = new HashSet<>();

        Filme filme = new Filme("Titanic", "diretor de titanic", Year.of(2000), generos);

        Serie serie = new Serie("Todo Mundo Odeia o Cris", generos);

        Plataforma plataforma = new Plataforma("Netflix", 123);

        this.plataformaRepository.deleteAll();
        this.generoRepository.deleteAll();
        this.serieRepository.deleteAll();
        this.filmeRepository.deleteAll();

        this.plataformaRepository.save(plataforma);

        this.generoRepository.save(drama);
        this.generoRepository.save(comedia);
        this.generoRepository.save(romance);
        this.generoRepository.save(acao);

        this.filmeRepository.save(filme);

        this.serieRepository.save(serie);
    }
}
