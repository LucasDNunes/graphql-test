package com.example.graphql.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.demo.domain.empregado.Empregado;
import com.example.graphql.demo.domain.empregado.EmpregadoRepository;
import com.example.graphql.demo.domain.projeto.ProjetoRepository;

import java.time.LocalDate;

public class Mutation implements GraphQLMutationResolver {

  private EmpregadoRepository empregadoRepository;
  private ProjetoRepository projetoRepository;

  public Mutation(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
    this.empregadoRepository = empregadoRepository;
    this.projetoRepository = projetoRepository;
  }

  public Empregado novoEmpregado(String nome, Integer idade) {
    Empregado empregado = Empregado.builder().nome(nome).idade(idade).nascimento(LocalDate.now()).build();
    empregadoRepository.save(empregado);
    return empregado;
  }

  public boolean deletarEmpregado(Long id) {
    empregadoRepository.deleteById(id);
    return true;
  }
}
