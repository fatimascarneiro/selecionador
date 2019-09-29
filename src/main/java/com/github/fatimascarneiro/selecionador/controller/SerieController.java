package com.github.fatimascarneiro.selecionador.controller;

import com.github.fatimascarneiro.selecionador.model.entity.Serie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serie")
public class SerieController {

    @GetMapping
    public Serie getSerie() {
        return new Serie ();
    }
}
