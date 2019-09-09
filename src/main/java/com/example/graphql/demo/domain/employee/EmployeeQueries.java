package com.example.graphql.demo.domain.employee;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeQueries implements GraphQLQueryResolver {

  private final EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeQueries(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }


  public List<Employee> employees() {
    return employeeRepository.findAll();
  }

  public Employee employee(Long id) {
    return employeeRepository.findById(id).orElse(null);
  }
}
