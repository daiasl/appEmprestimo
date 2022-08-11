package br.edu.infnet.appemprestimo;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Component
@Order(2)
public class EmprestimoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Emprestimo emp1 = new Emprestimo();		
		emp1.setDataEmprestimo(LocalDateTime.now());
		emp1.setDataDevolucao(null);
		
		AppImpressao.relatorio("Emp 1", emp1);
		
		Emprestimo emp2 = new Emprestimo();		
		emp2.setDataEmprestimo(LocalDateTime.of(2022, 4, 1, 10, 42));
		emp2.setDataDevolucao(LocalDateTime.of(2022, 8, 1, 10, 42));

		AppImpressao.relatorio("Emp 2", emp2);
		
		Emprestimo emp3 = new Emprestimo();		
		emp3.setDataEmprestimo(LocalDateTime.of(2022, 6, 1, 10, 42));
		emp3.setDataDevolucao(LocalDateTime.of(2022, 6, 30, 11, 00));
		
		AppImpressao.relatorio("Emp 3", emp3);	
	}

}
