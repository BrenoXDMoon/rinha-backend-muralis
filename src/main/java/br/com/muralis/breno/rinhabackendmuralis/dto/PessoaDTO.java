package br.com.muralis.breno.rinhabackendmuralis.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pessoa")
@Getter
@Setter
public class PessoaDTO {
    @Id
    @UuidGenerator
    private String id;

    private String apelido;
    private String nome;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate nascimento;

    private List<String> stack;

}
