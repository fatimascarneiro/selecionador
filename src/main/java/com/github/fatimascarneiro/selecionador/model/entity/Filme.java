package com.github.fatimascarneiro.selecionador.model.entity;

import java.time.Year;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Filme {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String nome;

    private String diretor;

    private Year ano;

    @NotNull
    @ManyToMany(mappedBy = "filmes")
    private Set<Genero> generos;

    Set<Filme> filmes;

    public Filme(String nome, String diretor, Year ano, Set<Genero> generos) {
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.generos = generos;
    }

    public Filme() {
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public Set<Genero> getGeneros() {
        return generos;
    }

    public String getDiretor() {
        return diretor;
    }

    public Year getAno() {
        return ano;
    }

    private Set<Filme> buscaFilmePorDiretor(String diretor) {
        filmes.stream()
            .filter(f -> this.getDiretor().equals(diretor))
            .map(f -> this.getDiretor());

        return filmes;
    }

    //TODO: arrumar
//    private Set<Filme> buscaFilmePorAno(Year ano) {
//        coletaTodosOsFilmesDeUmaPlataforma(plataforma);
//
//        filmes.stream()
//            .filter(f -> filme.getAno().equals(ano))
//            .map(f -> filme.getAno());
//
//        return filmes;
//    }

    private Set<Filme> buscaFilmePorGenero(Genero genero) {
        return filmes.stream()
            .filter(s -> s.getGeneros().contains(genero))
            .collect(Collectors.toSet());
    }
}
