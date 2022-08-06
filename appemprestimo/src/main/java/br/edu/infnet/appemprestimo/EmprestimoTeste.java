package br.edu.infnet.appemprestimo;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;

@Component
@Order(2)
public class EmprestimoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Emprestimo emp1 = new Emprestimo();
		emp1.setId(1);
		emp1.setDataEmprestimo(LocalDateTime.now());
		emp1.setDataDevolucao(null);
		System.out.println(emp1);
		
		Emprestimo emp2 = new Emprestimo();
		emp2.setId(2);
		emp2.setDataEmprestimo(LocalDateTime.of(2022, 4, 1, 10, 42));
		emp2.setDataDevolucao(LocalDateTime.of(2022, 8, 1, 10, 42));
		System.out.println(emp2);
		
		Emprestimo emp3 = new Emprestimo();
		emp3.setId(3);
		emp3.setDataEmprestimo(LocalDateTime.of(2022, 6, 1, 10, 42));
		emp3.setDataDevolucao(LocalDateTime.of(2022, 6, 30, 11, 00));
		System.out.println(emp3);		
	}

}
