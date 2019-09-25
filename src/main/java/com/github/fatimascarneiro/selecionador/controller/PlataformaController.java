package com.github.fatimascarneiro.selecionador.controller;

import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;
import com.github.fatimascarneiro.selecionador.model.service.PlataformaService;
import com.github.fatimascarneiro.selecionador.view.PlataformaView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plataforma")
public class PlataformaController {

    private PlataformaService service;

    public PlataformaController(PlataformaService service) {
        this.service = service;
    }

    /**
     * FIXME: nao vai funcionar. descubra o pq
     */
    @GetMapping
    public PlataformaView getPlataforma(Integer id) {
        Plataforma plataforma = service.buscar(id);

        return new PlataformaView(plataforma);
    }
}
