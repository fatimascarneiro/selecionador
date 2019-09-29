package com.github.fatimascarneiro.selecionador.view;

import com.github.fatimascarneiro.selecionador.model.entity.Filme;
import com.github.fatimascarneiro.selecionador.model.entity.Genero;

import java.time.Year;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilmeView {
    private String nome;
    private String diretor;
    private Year ano;
    private Set<Genero> generos;

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public FilmeView(Filme filme) {
        this.nome = filme.getNome();
        this.diretor = filme.getDiretor();
        this.generos = filme.getGeneros();
    }

    public static List<FilmeView> from(List<Filme> filmes) {
        return filmes
                .stream()
                .map(FilmeView::new)
                .collect(Collectors.toList());
    }
}