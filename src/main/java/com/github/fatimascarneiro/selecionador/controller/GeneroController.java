package com.github.fatimascarneiro.selecionador.controller;

import com.github.fatimascarneiro.selecionador.model.entity.Genero;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @GetMapping
    public Genero getGenero() {
        return new Genero ();
    }
}
