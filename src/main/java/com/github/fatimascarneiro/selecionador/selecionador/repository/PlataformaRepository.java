package com.github.fatimascarneiro.selecionador.selecionador.repository;

import com.github.fatimascarneiro.selecionador.selecionador.model.Categoria;
import com.github.fatimascarneiro.selecionador.selecionador.model.Filme;
import com.github.fatimascarneiro.selecionador.selecionador.model.Plataforma;
import com.github.fatimascarneiro.selecionador.selecionador.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlataformaRepository  extends JpaRepository {
    private List<Plataforma> dataBase;

    public void adicionarPlataforma(Plataforma plataforma){
        dataBase.add(plataforma);

    }

    public Plataforma getPlataformaByName(String nome){
        for (Plataforma plataforma: dataBase) {
            if (plataforma.getNome().equalsIgnoreCase(nome)) {
                return plataforma;
            }
        }
        //TODO throw new exception para qunado não achar plataforma;
        return null;
    }

    public Plataforma getPlataformaById(int id){
        for (int i=0; i < dataBase.size(); i++ ) {
            if (dataBase.get(i).getId() == id) {
                return dataBase.get(i);
            }
        }
        return null;
    }

    public List<Plataforma> getAllPlataformas(){
        return dataBase;
    }

    public PlataformaRepository(){
        this.dataBase = new ArrayList<>();
        this.init();
    }

    //TODO TIRAR ESSE TRECO DAQUI DEPOIS E JOGAR NO BANCO
    private void init(){
        List<Serie> series = new ArrayList<>();
        List<Filme> filmes = new ArrayList<>();


        series.add(new Serie("Todo Mundo odeia o Cris", Categoria.COMEDIA));
        series.add(new Serie("As Visões da Raven", Categoria.COMEDIA));
        series.add(new Serie("Um Maluco no Pedaço", Categoria.COMEDIA));
        series.add(new Serie("Phineas e Ferb", Categoria.ANIMACAO));

        filmes.add(new Filme("Up - Altas Aventuras", Categoria.ANIMACAO));
        filmes.add(new Filme("Senhor dos Anéis", Categoria.AVENTURA));
        filmes.add(new Filme("Matrix", Categoria.ACAO));
        filmes.add(new Filme("Titanic", Categoria.ROMANCE));

        Plataforma plataforma = new Plataforma("Netflix", 1);
        plataforma.setSeries(series);
        plataforma.setFilmes(filmes);

        this.adicionarPlataforma(plataforma);

        series = new ArrayList<>();
        filmes = new ArrayList<>();

        series.add(new Serie("Hora de Aventura", Categoria.ANIMACAO));
        series.add(new Serie("The Good Place", Categoria.COMEDIA));
        series.add(new Serie("One Day At a Time", Categoria.FAMILIA));

        filmes.add(new Filme("Hora de Aventura", Categoria.ANIMACAO));
        filmes.add(new Filme("The Good Place", Categoria.COMEDIA));
        filmes.add(new Filme("One Day At a Time", Categoria.FAMILIA));

        plataforma = new Plataforma("HBO", 2);
        plataforma.setSeries(series);
        plataforma.setFilmes(filmes);

        this.adicionarPlataforma(plataforma);

        series = new ArrayList<>();
        filmes = new ArrayList<>();

        series.add(new Serie("Grey's Anathomy", Categoria.DRAMA));
        series.add(new Serie("Brooklyn 99", Categoria.COMEDIA));

        filmes.add(new Filme("Grey's Anathomy", Categoria.DRAMA));
        filmes.add(new Filme("Orange Is The New Black", Categoria.DRAMA));

        plataforma = new Plataforma("Popcorn Time", 3);
        plataforma.setSeries(series);
        plataforma.setFilmes(filmes);

        this.adicionarPlataforma(plataforma);


    }

}
