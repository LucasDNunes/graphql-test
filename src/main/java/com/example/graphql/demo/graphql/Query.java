package com.example.graphql.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.demo.domain.empregado.Empregado;
import com.example.graphql.demo.domain.empregado.EmpregadoService;

import java.util.List;

public class Query implements GraphQLQueryResolver {

  private EmpregadoService empregadoService;


  public Query(EmpregadoService empregadoService) {
    this.empregadoService = empregadoService;
  }

  public List<Empregado> findAllEmpregados(){
    return empregadoService.findAll();
  }

  public Empregado findEmpregadoPorId(Long id) {
    return empregadoService.findById(id);
  }
}
