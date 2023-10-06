package br.com.muralis.breno.rinhabackendmuralis.controller;

import br.com.muralis.breno.rinhabackendmuralis.dto.PessoaDTO;
import br.com.muralis.breno.rinhabackendmuralis.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService service;

    @PostMapping
    public ResponseEntity salvarPessoa(PessoaDTO pessoaDTO){
        service.salvarPessoa(pessoaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).header("Location", "/pessoas/" + pessoaDTO.getId()).body(pessoaDTO);
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
