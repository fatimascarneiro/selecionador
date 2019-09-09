package com.github.fatimascarneiro.selecionador.selecionador.repository;

import com.github.fatimascarneiro.selecionador.selecionador.model.Categoria;
import com.github.fatimascarneiro.selecionador.selecionador.model.Filme;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmeRepository {
    private List<Filme> dataBase;

    public void adicionarFilme(Filme filme){
        dataBase.add(filme);
    }

    public Filme getFilmeByName(String nome){
        for (Filme filme: dataBase) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        //TODO throw new exception para qunado não achar filme;
        return null;
    }

    public List<Filme> getAllFilmes(){
        return dataBase;
    }

    public FilmeRepository(){
        this.dataBase = new ArrayList<>();
        this.init();
    }

    //TODO TIRAR ESSE TRECO DAQUI DEPOIS E JOGAR NO BANCO
    private void init() {
        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme("Up - Altas Aventuras", Categoria.ANIMACAO));
        filmes.add(new Filme("Senhor dos Anéis", Categoria.AVENTURA));
        filmes.add(new Filme("Matrix", Categoria.ACAO));
        filmes.add(new Filme("Titanic", Categoria.ROMANCE));
        filmes.add(new Filme("Hora de Aventura", Categoria.ANIMACAO));
        filmes.add(new Filme("The Good Place", Categoria.COMEDIA));
        filmes.add(new Filme("One Day At a Time", Categoria.FAMILIA));
        filmes.add(new Filme("Grey's Anathomy", Categoria.DRAMA));
        filmes.add(new Filme("Orange Is The New Black", Categoria.DRAMA));

    }

}
