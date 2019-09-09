package com.example.graphql.demo.domain.employee;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMutations implements GraphQLMutationResolver {

  private final EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeMutations(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }


  public Employee newEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

  public boolean deleteEmployee(Long id) {
    Employee employee = employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("não encontrado com id "+ id.toString()));
    employeeRepository.delete(employee);
    return true;
  }

  public Employee updateEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }
}
