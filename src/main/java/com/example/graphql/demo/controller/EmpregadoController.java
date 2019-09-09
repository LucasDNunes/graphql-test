package com.example.graphql.demo.controller;

import com.example.graphql.demo.domain.empregado.Empregado;
import com.example.graphql.demo.domain.empregado.EmpregadoService;
import graphql.schema.idl.SchemaParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {

  private final EmpregadoService empregadoService;

  @Autowired
  public EmpregadoController(EmpregadoService empregadoService) {
    this.empregadoService = empregadoService;
  }

  @GetMapping
  public List<Empregado> listarTodos() {
    new SchemaParser();

    return empregadoService.findAll();
  }


}
