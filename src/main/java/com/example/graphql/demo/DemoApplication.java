package com.example.graphql.demo;

import com.example.graphql.demo.domain.empregado.EmpregadoRepository;
import com.example.graphql.demo.domain.empregado.EmpregadoService;
import com.example.graphql.demo.graphql.Mutation;
import com.example.graphql.demo.graphql.Query;
import com.example.graphql.demo.domain.projeto.ProjetoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Query query(EmpregadoService empregadoService){
		return new Query(empregadoService);
	}

	@Bean
	public Mutation mutation(EmpregadoRepository empregadoRepository, ProjetoRepository projetoRepository) {
		return new Mutation(empregadoRepository, projetoRepository);
	}
}
