package com.example.graphql.demo.domain.empregado;

import com.example.graphql.demo.domain.projeto.Projeto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class EmpregadoServiceImpl implements EmpregadoService {

  @Override
  public List<Empregado> findAll() {
    return Collections.singletonList(Empregado.builder()
            .id(1L)
            .idade(19)
            .nascimento(LocalDate.now())
            .nome("Lucas")
            .projetos(Collections.singletonList(Projeto.builder()
                    .id(1L)
                    .codigoServico(15)
                    .nome("Teste")
                    .responsavel("responsavel")
                    .prazo(LocalDate.now())
                    .build()))
            .build());
  }

  @Override
  public Empregado findById(Long id) {
    return Empregado.builder()
            .id(id)
            .nome("Lucas")
            .build();
  }
}
