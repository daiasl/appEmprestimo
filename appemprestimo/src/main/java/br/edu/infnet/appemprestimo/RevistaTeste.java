package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.controller.RevistaController;
import br.edu.infnet.appemprestimo.model.domain.Revista;

@Component
@Order(4)
public class RevistaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		try {
			Revista revista1=new Revista();
			revista1.setIssn("1980393-1");
			revista1.setEdicao(6);
			revista1.setAno(2011);
			revista1.setTitulo(".Net Magazine");
			revista1.setEstante(5);
			revista1.setCodigoBarras("");
			revista1.setQtdDisponiveis(20);
			revista1.setQtdExemplares(20);	
			System.out.println("Calcula qtd. produto emprestado: " + revista1.CalculaQtdProdutoEmprestado());
			RevistaController.incluir(revista1);
		} catch (Exception e) {
			System.out.println("[ERROR - Revista] " + e.getMessage());
		}
		
		
		try {
			Revista revista2=new Revista();
			revista2.setIssn("2357-7886");
			revista2.setEdicao(138);
			revista2.setAno(2021);
			revista2.setTitulo("Revista Wine - Entrevista com Julia Cavil");
			revista2.setEstante(5);
			revista2.setCodigoBarras("9772357788009");
			revista2.setQtdDisponiveis(3);
			revista2.setQtdExemplares(20);	
			System.out.println("Calcula qtd. produto emprestado: " + revista2.CalculaQtdProdutoEmprestado());
			RevistaController.incluir(revista2);
		} catch (Exception e) {
			System.out.println("[ERROR - Revista] " + e.getMessage());
		}
		
		try {
			Revista revista3=new Revista();		
			revista3.setIssn("456-7890");
			revista3.setEdicao(1);
			revista3.setAno(2022);
			revista3.setTitulo("História da Humanidade");
			revista3.setEstante(5);
			revista3.setCodigoBarras("");
			revista3.setQtdDisponiveis(1);
			revista3.setQtdExemplares(1);	
			System.out.println("Calcula qtd. produto emprestado: " + revista3.CalculaQtdProdutoEmprestado());
			RevistaController.incluir(revista3);
		} catch (Exception e) {
			System.out.println("[ERROR - Revista] " + e.getMessage());
		}
		
		try {
			Revista revista4=new Revista();		
			revista4.setIssn("456-7890");
			revista4.setEdicao(1);
			revista4.setAno(2022);
			revista4.setTitulo("História da Humanidade");
			revista4.setEstante(5);
			revista4.setCodigoBarras("");
			revista4.setQtdDisponiveis(0);
			revista4.setQtdExemplares(1);	
			System.out.println("Calcula qtd. produto emprestado: " + revista4.CalculaQtdProdutoEmprestado());
			RevistaController.incluir(revista4);
		} catch (Exception e) {
			System.out.println("[ERROR - Revista] " + e.getMessage());
		}
		
		try {
			Revista revista5=new Revista();		
			revista5.setIssn("456-7890");
			revista5.setEdicao(1);
			revista5.setAno(2022);
			revista5.setTitulo("História da Humanidade");
			revista5.setEstante(5);
			revista5.setCodigoBarras("");
			revista5.setQtdDisponiveis(99);
			revista5.setQtdExemplares(1);	
			System.out.println("Calcula qtd. produto emprestado: " + revista5.CalculaQtdProdutoEmprestado());
			RevistaController.incluir(revista5);
		} catch (Exception e) {
			System.out.println("[ERROR - Revista] " + e.getMessage());
		}
		
	}

}
