package com.github.fatimascarneiro.selecionador.model;

import com.github.fatimascarneiro.selecionador.exception.FilmeException;

import java.time.Year;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Filme {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String diretor;
    private Year ano;

    @ManyToMany(mappedBy = "filmes")
    private Set<Genero> generos;

    public Filme(String nome, String diretor, Year ano, Set<Genero> generos) {
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.generos = generos;
    }

    public String getNome() {
        return nome;
    }

    private void plataformaSemNome() throws FilmeException {
        if (nome.isEmpty()) {
            throw new FilmeException("É necessário informar o nome do filme.");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
