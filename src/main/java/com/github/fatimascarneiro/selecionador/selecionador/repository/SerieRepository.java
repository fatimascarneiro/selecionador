package com.github.fatimascarneiro.selecionador.selecionador.repository;

import com.github.fatimascarneiro.selecionador.selecionador.model.Categoria;
import com.github.fatimascarneiro.selecionador.selecionador.model.Serie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SerieRepository {
    private List<Serie> dataBase;

    public void adicionarSerie(Serie serie){
        dataBase.add(serie);

    }

    public Serie getSerieByName(String nome){
        for (Serie serie: dataBase) {
            if (serie.getNome().equalsIgnoreCase(nome)) {
                return serie;
            }
        }
        //TODO throw new exception para qunado não achar série;
        return null;
    }

    public List<Serie> getAllSeries(){
        return dataBase;
    }

    public SerieRepository(){
        this.dataBase = new ArrayList<>();
        this.init();
    }

    //TODO TIRAR ESSE TRECO DAQUI DEPOIS E JOGAR NO BANCO
    private void init() {
        List<Serie> series = new ArrayList<>();

        series.add(new Serie("Todo Mundo odeia o Cris", Categoria.COMEDIA));
        series.add(new Serie("As Visões da Raven", Categoria.COMEDIA));
        series.add(new Serie("Um Maluco no Pedaço", Categoria.COMEDIA));
        series.add(new Serie("Phineas e Ferb", Categoria.ANIMACAO));
        series.add(new Serie("Hora de Aventura", Categoria.ANIMACAO));
        series.add(new Serie("The Good Place", Categoria.COMEDIA));
        series.add(new Serie("One Day At a Time", Categoria.FAMILIA));
        series.add(new Serie("Grey's Anathomy", Categoria.DRAMA));
        series.add(new Serie("Brooklyn 99", Categoria.COMEDIA));
    }
}
