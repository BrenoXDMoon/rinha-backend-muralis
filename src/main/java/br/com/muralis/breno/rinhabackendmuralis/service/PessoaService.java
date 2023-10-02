package br.com.muralis.breno.rinhabackendmuralis.service;

import br.com.muralis.breno.rinhabackendmuralis.dto.PessoaDTO;
import br.com.muralis.breno.rinhabackendmuralis.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaDTORepository;

    public PessoaService(PessoaRepository pessoaDTORepository) {
        this.pessoaDTORepository = pessoaDTORepository;
    }


    public void salvarPessoa(PessoaDTO pessoaDTO) {
        pessoaDTORepository.save(pessoaDTO);
    }

    public List<PessoaDTO> buscarPessoa(String palavra) {
        return pessoaDTORepository.buscarPorPalavra(palavra).toList();
    }

    public List<PessoaDTO> buscarPorTermo(String termo){
        return pessoaDTORepository.buscarPorTermo(termo).toList();
    }
}
