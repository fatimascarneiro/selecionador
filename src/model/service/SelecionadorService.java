package model.service;

import model.entity.Plataforma;

import java.util.List;

public class SelecionadorService {
    List escolhaDoQueSeraAssistido;
    Plataforma plataforma = new Plataforma();
    Plataforma qualquerPlataforma = new Plataforma();
    Plataforma escolhaDaPlataforma = new Plataforma();

    public void main () {
        escolherPlataforma();
        escolherEntreFilmeESerie();
        selecionador();
    }

    public Plataforma escolherPlataforma(){
        if (plataforma != null){
            escolhaDaPlataforma = plataforma;
        }
        return escolhaDaPlataforma != null ?  qualquerPlataforma :null;
    }

    public List escolherEntreFilmeESerie() {
        if (escolhaDaPlataforma.equals(escolhaDaPlataforma.getSeries())){
            escolhaDoQueSeraAssistido = escolhaDaPlataforma.getSeries();
        } else if (escolhaDaPlataforma.equals(escolhaDaPlataforma.getFilmes())) {
            escolhaDoQueSeraAssistido = escolhaDaPlataforma.getFilmes();
        } else {
            escolhaDoQueSeraAssistido = escolhaDaPlataforma.getTodoCatalogoDaPlataforma();
        }

        return escolhaDoQueSeraAssistido;
    }

    public void selecionador() {
        escolhaDoQueSeraAssistido.stream().sorted();
    }
}
