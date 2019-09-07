package com.github.fatimascarneiro.selecionador.selecionador.controller;

import com.github.fatimascarneiro.selecionador.selecionador.model.Plataforma;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlataformaController {

    @GetMapping("/get")
    public Plataforma getPlataforma() {
        return new Plataforma (
                "Netflix", 123
        );
    }

}
