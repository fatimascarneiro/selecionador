package com.github.fatimascarneiro.selecionador;

import com.github.fatimascarneiro.selecionador.repository.FilmeRepository;
import com.github.fatimascarneiro.selecionador.repository.GeneroRepository;
import com.github.fatimascarneiro.selecionador.repository.PlataformaRepository;
import com.github.fatimascarneiro.selecionador.repository.SerieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        this.plataformaRepository.deleteAll();
        this.generoRepository.deleteAll();
        this.serieRepository.deleteAll();
        this.filmeRepository.deleteAll();

    }
}
