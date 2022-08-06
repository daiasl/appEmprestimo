package br.edu.infnet.appemprestimo;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;

@Component
public class EmprestimoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Emprestimo emp1 = new Emprestimo();
		emp1.id = 1;
		emp1.dataEmprestimo = LocalDateTime.now();
		emp1.dataDevolucao = null;
		System.out.println(emp1);
		
		Emprestimo emp2 = new Emprestimo();
		emp2.id = 2;
		emp2.dataEmprestimo = LocalDateTime.of(2022, 4, 1, 10, 42);
		emp2.dataDevolucao = LocalDateTime.of(2022, 8, 1, 10, 42);;
		System.out.println(emp2);
		
		Emprestimo emp3 = new Emprestimo();
		emp3.id = 3;
		emp3.dataEmprestimo = LocalDateTime.of(2022, 6, 1, 10, 42);
		emp3.dataDevolucao = LocalDateTime.of(2022, 6, 30, 11, 00);;
		System.out.println(emp3);		
	}

}
