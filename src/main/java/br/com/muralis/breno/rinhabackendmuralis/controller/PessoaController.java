package br.com.muralis.breno.rinhabackendmuralis.controller;

import br.com.muralis.breno.rinhabackendmuralis.dto.PessoaDTO;
import br.com.muralis.breno.rinhabackendmuralis.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService service;

    @PostMapping
    public void salvarPessoa(PessoaDTO pessoaDTO){
        service.salvarPessoa(pessoaDTO);
    }

    @GetMapping("{palavra}")
    public List<PessoaDTO> buscarPessoa(String palavra){
        return service.buscarPessoa(palavra);
    }

    @GetMapping
    public List<PessoaDTO> buscarPessoasPorTermo(@PathVariable(name = "t") String termo){
        return buscarPessoasPorTermo(termo);
    }

}
