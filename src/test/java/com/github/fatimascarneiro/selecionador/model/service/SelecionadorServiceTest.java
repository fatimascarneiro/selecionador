package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.PlataformaException;
import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class SelecionadorServiceTest {
    private Plataforma plataforma;

    @Test(expected = PlataformaException.class)
    public void garanteQuePlataformaTemElemento() {
        dadoUmaPlataforma();
        quandoNaoHouverFilmesNela();
    }

    private void quandoNaoHouverFilmesNela() {
        assertNull(plataforma.getFilmes());
    }

    private void dadoUmaPlataforma() {
        plataforma = new Plataforma();
    }
}