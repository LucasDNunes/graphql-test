package com.example.graphql.demo.domain.empregado;

import com.example.graphql.demo.domain.projeto.Projeto;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empregado {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "idade")
  private Integer idade;

  @Column(name = "nascimento")
  private LocalDate nascimento;

  @OneToMany(mappedBy = "empregado", fetch = FetchType.EAGER)
  private List<Projeto> projetos;

}
