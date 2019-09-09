package com.github.fatimascarneiro.selecionador.selecionador.model;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String nome;
    private String canalOuProducao;
    private Categoria categoria;

    public Serie(String nome, Categoria categoria){
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCanalOuProducao() {
        return canalOuProducao;
    }

    public void setCanalOuProducao(String canalOuProducao) {
        this.canalOuProducao = canalOuProducao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
