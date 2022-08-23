package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.controller.LivroController;
import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.exceptions.AnoPublicacaoInvalidoException;

@Component
@Order(3)
public class LivroTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		try {
			Livro livro1 = new Livro();
			livro1.setIsbn("987-85-508-1500-8");
			livro1.setVolume(1);
			livro1.setEdicao(1);
			livro1.setAnoPublicacao(2020);
			livro1.setNomeAutor("Robert C. Martin");
			livro1.setTitulo("Desenvolvimento de Software Ágil");
			livro1.setEstante(1);
			livro1.setCodigoBarras("9788550815008");
			livro1.setQtdDisponiveis(5);
			livro1.setQtdExemplares(6);
			System.out.println("Calcula qtd. produto emprestado: " + livro1.CalculaQtdProdutoEmprestado());
			LivroController.incluir(livro1);
		} catch (AnoPublicacaoInvalidoException e) {
			System.out.println("[ERROR - Livro] " + e.getMessage());
		}

		try {
			Livro livro2 = new Livro();
			livro2.setIsbn("987-5-01-30451-3");
			livro2.setVolume(1);
			livro2.setEdicao(2);
			livro2.setAnoPublicacao(2022);
			livro2.setNomeAutor("Kate Quinn");
			livro2.setTitulo("A Rede de Alice");
			livro2.setEstante(2);
			livro2.setCodigoBarras("978850304513");
			livro2.setQtdDisponiveis(3);
			livro2.setQtdExemplares(10);
			System.out.println("Calcula qtd. produto emprestado: " + livro2.CalculaQtdProdutoEmprestado());
			LivroController.incluir(livro2);
		} catch (AnoPublicacaoInvalidoException e) {
			System.out.println("[ERROR - Livro] " + e.getMessage());
		}
		
		try {
			Livro livro3 = new Livro();
			livro3.setIsbn("987-65-5564-024-3");
			livro3.setVolume(1);
			livro3.setEdicao(1);
			livro3.setAnoPublicacao(2020);
			livro3.setNomeAutor("Daiana Garbin");
			livro3.setTitulo("A vida perfeita não existe");
			livro3.setEstante(3);
			livro3.setCodigoBarras("9786555640243");
			livro3.setQtdDisponiveis(2);
			livro3.setQtdExemplares(2);
			System.out.println("Calcula qtd. produto emprestado: " + livro3.CalculaQtdProdutoEmprestado());
			LivroController.incluir(livro3);
		} catch (AnoPublicacaoInvalidoException e) {
			System.out.println("[ERROR - Livro] " + e.getMessage());
		}
		
		try {
			Livro livro4 = new Livro();
			livro4.setIsbn("987-65-5564-024-3");
			livro4.setVolume(1);
			livro4.setEdicao(1);
			livro4.setAnoPublicacao(1850);
			livro4.setNomeAutor("Daiana Garbin");
			livro4.setTitulo("A vida perfeita não existe");
			livro4.setEstante(3);
			livro4.setCodigoBarras("9786555640243");
			livro4.setQtdDisponiveis(2);
			livro4.setQtdExemplares(2);
			System.out.println("Calcula qtd. produto emprestado: " + livro4.CalculaQtdProdutoEmprestado());
			LivroController.incluir(livro4);
		} catch (AnoPublicacaoInvalidoException e) {
			System.out.println("[ERROR - Livro] " + e.getMessage());
		}

	}

}
