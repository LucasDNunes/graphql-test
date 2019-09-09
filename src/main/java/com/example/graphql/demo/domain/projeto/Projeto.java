package com.example.graphql.demo.domain.projeto;

import com.example.graphql.demo.domain.empregado.Empregado;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Projeto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "codigo_servico")
  private Integer codigoServico;

  @Column(name = "responsavel")
  private String responsavel;

  @Column(name = "prazo")
  private LocalDate prazo;

  @ManyToOne
  @JoinColumn(name = "empregado_id")
  private Empregado empregado;

}
