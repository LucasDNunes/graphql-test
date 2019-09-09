package com.example.graphql.demo.domain.empregado;

import java.util.List;

public interface EmpregadoService {

  List<Empregado> findAll();

  Empregado findById(Long id);
}
