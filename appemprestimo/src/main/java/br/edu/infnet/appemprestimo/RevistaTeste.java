package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Revista;

@Component
@Order(4)
public class RevistaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Revista revista1=new Revista();
		revista1.setIssn("1980393-1");
		revista1.setEdicao(6);
		revista1.setAno(2011);
		revista1.setTitulo(".Net Magazine");
		revista1.setEstante(5);
		revista1.setCodigoBarras("");
		revista1.setQtdDisponiveis(20);
		revista1.setQtdExemplares(20);		
		System.out.println(revista1);
	
		Revista revista2=new Revista();
		revista2.setIssn("2357-7886");
		revista2.setEdicao(138);
		revista2.setAno(2021);
		revista2.setTitulo("Revista Wine - Entrevista com Julia Cavil");
		revista2.setEstante(5);
		revista2.setCodigoBarras("9772357788009");
		revista2.setQtdDisponiveis(3);
		revista2.setQtdExemplares(20);	
		System.out.println(revista2);

		Revista revista3=new Revista();		
		revista3.setIssn("456-7890");
		revista3.setEdicao(1);
		revista3.setAno(2022);
		revista3.setTitulo("História da Humanidade");
		revista3.setEstante(5);
		revista3.setCodigoBarras("");
		revista3.setQtdDisponiveis(1);
		revista3.setQtdExemplares(1);	
		System.out.println(revista3);
	
	}

}
