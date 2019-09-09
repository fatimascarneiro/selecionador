package com.github.fatimascarneiro.selecionador.selecionador.model;

public class Filme {
    private String nome;
    private String diretor;
    private Integer ano;
    private Categoria categoria;

    public Filme(String nome, Categoria categoria){
        this.nome = nome;
        this.categoria = categoria;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
