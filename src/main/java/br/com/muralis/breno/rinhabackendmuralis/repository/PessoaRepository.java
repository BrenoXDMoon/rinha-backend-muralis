package br.com.muralis.breno.rinhabackendmuralis.repository;

import br.com.muralis.breno.rinhabackendmuralis.dto.PessoaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface PessoaRepository extends JpaRepository<PessoaDTO, Long> {

    @Query("SELECT p FROM PessoaDTO p WHERE p.nome LIKE %:palavra%")
    Stream<PessoaDTO> buscarPorPalavra(String palavra);

    @Query("SELECT p FROM PessoaDTO p " +
            "WHERE p.nome LIKE %:termo% " +
            "OR p.email LIKE %:termo% " +
            "OR p.telefone LIKE %:termo%")
    Stream<PessoaDTO> buscarPorTermo(@Param("termo") String termo);

}