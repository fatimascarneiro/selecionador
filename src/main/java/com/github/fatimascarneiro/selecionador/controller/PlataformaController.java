package com.github.fatimascarneiro.selecionador.controller;

import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plataforma")
public class PlataformaController {

    @GetMapping
    public Plataforma getPlataforma() {
        return new Plataforma (
                "Netflix", 123
        );
    }

}
