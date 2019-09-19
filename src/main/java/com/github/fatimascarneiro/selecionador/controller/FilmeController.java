package com.github.fatimascarneiro.selecionador.controller;

import com.github.fatimascarneiro.selecionador.model.entity.Filme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @GetMapping
    public Filme getFilme() {
        return new Filme ();
    }
}
