package com.example.graphql.demo.domain.employee;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "age")
  private Long age;

  @Column(name = "position")
  private String position;

  @Column(name = "salary")
  private Double salary;

}
