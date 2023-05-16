package br.com.apinaruto.controller;

import br.com.apinaruto.model.DadosCadastroPersonagem;
import br.com.apinaruto.model.DadosListagemPersonagem;
import br.com.apinaruto.model.Personagem;
import br.com.apinaruto.model.PersonagemRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemRepository personagemRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPersonagem dadosCadastroPersonagem) {
        Personagem personagem = new Personagem(dadosCadastroPersonagem);
        personagemRepository.save(personagem);
    }

    @GetMapping
    public List<DadosListagemPersonagem> listar() {
        return personagemRepository.findAll().stream()
                .map(DadosListagemPersonagem::new)
                .toList();
    }
}
