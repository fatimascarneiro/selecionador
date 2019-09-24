package com.github.fatimascarneiro.selecionador.model.service;

import com.github.fatimascarneiro.selecionador.exception.PlataformaException;
import com.github.fatimascarneiro.selecionador.model.entity.Plataforma;
import com.github.fatimascarneiro.selecionador.repository.PlataformaRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlataformaService {

    private PlataformaRepository plataformaRepository;

//    private void plataformaSemNome() throws PlataformaException {
//
//        if (plataforma.getNome().isEmpty()) {
//            throw new PlataformaException("A plataforma precisa ter um nome.");
//        }
//    }

    public Plataforma buscar(Integer id) {
        return plataformaRepository.findById(id)
            .orElseThrow(() -> new PlataformaException("Não existe uma plataforma com o id buscado"));
    }

//    private Plataforma buscaPlataformaPeloNome(String nomeDeUmaPlataforma) {
//
//        plataformas
//            .stream()
//            .filter(p -> equals(this.getNome()))
//            .findFirst();
//
//        return this;
//    }
}
