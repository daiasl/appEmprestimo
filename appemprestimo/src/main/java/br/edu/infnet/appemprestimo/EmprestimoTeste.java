package br.edu.infnet.appemprestimo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.controller.EmprestimoController;
import br.edu.infnet.appemprestimo.model.domain.Emprestimo;
import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;
import br.edu.infnet.appemprestimo.model.domain.Produto;
import br.edu.infnet.appemprestimo.model.domain.Revista;
import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appemprestimo.model.exceptions.EmprestimoSemProdutoException;
import br.edu.infnet.appemprestimo.model.exceptions.UsuarioNuloException;

@Component
@Order(2)
public class EmprestimoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		
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
		
		Livro livro2 = new Livro();
		livro2.setIsbn("987-85-508-1500-8");
		livro2.setVolume(1);
		livro2.setEdicao(1);
		livro2.setAnoPublicacao(2020);
		livro2.setNomeAutor("Robert C. Martin");
		livro2.setTitulo("Desenvolvimento de Software Ágil 2");
		livro2.setEstante(1);
		livro2.setCodigoBarras("9788550815008");
		livro2.setQtdDisponiveis(5);
		livro2.setQtdExemplares(6);
		
		MaterialDigital md1 = new MaterialDigital();
		md1.setDoi("10.1590/S1415");
		md1.setAno(1998);
		md1.setVolume(1);
		md1.setLinkDoi("https://doi.org/10.1590/S1415-65551998000300009");
		md1.setTitulo("Sistemas de Informação no Brasil: uma análise dos artigos científicos dos anos 90");
		md1.setEstante(4);
		md1.setCodigoBarras("");
		md1.setQtdDisponiveis(1);
		md1.setQtdExemplares(1);
		
		Revista revista1=new Revista();
		revista1.setIssn("1980393-1");
		revista1.setEdicao(6);
		revista1.setAno(2011);
		revista1.setTitulo(".Net Magazine");
		revista1.setEstante(5);
		revista1.setCodigoBarras("");
		revista1.setQtdDisponiveis(20);
		revista1.setQtdExemplares(20);
		
		
		try {
			Set<Produto> listaProdutosEmp1 = new HashSet<Produto>();
			listaProdutosEmp1.add(livro1);
			listaProdutosEmp1.add(livro1);
			listaProdutosEmp1.add(livro2);
			listaProdutosEmp1.add(livro2);
			listaProdutosEmp1.add(md1);
			listaProdutosEmp1.add(revista1);
			
			Usuario user1 = new Usuario("João da Silva","11111111111");
			
			Emprestimo emp1 = new Emprestimo(user1,listaProdutosEmp1);
			emp1.setDataDevolucao(null);
			EmprestimoController.incluir(emp1);			
		} catch (CpfInvalidoException | UsuarioNuloException | EmprestimoSemProdutoException e) {
			System.out.println("[ERROR - Emprestimo ] " + e.getMessage());
		}
		
		try {
			Set<Produto> listaProdutosEmp2 = new HashSet<Produto>();
			listaProdutosEmp2.add(livro1);
			listaProdutosEmp2.add(md1);
			
			Usuario user2=new Usuario("Ana de Souza Pereira","22222222222");
			
			Emprestimo emp2 = new Emprestimo(user2,listaProdutosEmp2);
			emp2.setDataDevolucao(LocalDateTime.of(2022, 8, 1, 10, 42));		
			EmprestimoController.incluir(emp2);
		} catch (CpfInvalidoException | UsuarioNuloException | EmprestimoSemProdutoException e) {
			System.out.println("[ERROR - Emprestimo ] " + e.getMessage());
		}

		try {
			Set<Produto> listaProdutosEmp3 = new HashSet<Produto>();		
			listaProdutosEmp3.add(revista1);
			
			Usuario user3=new Usuario("Maria Helena da Silva","33333333333");
			
			Emprestimo emp3 = new Emprestimo(user3, listaProdutosEmp3);		
			emp3.setDataDevolucao(LocalDateTime.of(2022, 6, 30, 11, 00));
			EmprestimoController.incluir(emp3);
		} catch (CpfInvalidoException | UsuarioNuloException | EmprestimoSemProdutoException e) {
			System.out.println("[ERROR - Emprestimo ] " + e.getMessage());
		}
		
		try {
			Set<Produto> listaProdutosEmp4 = new HashSet<Produto>();		
			listaProdutosEmp4.add(revista1);
			
			Emprestimo emp4 = new Emprestimo(null, listaProdutosEmp4);		
			emp4.setDataDevolucao(LocalDateTime.of(2022, 6, 30, 11, 00));
			EmprestimoController.incluir(emp4);
		} catch (UsuarioNuloException | EmprestimoSemProdutoException e) {
			System.out.println("[ERROR - Emprestimo ] " + e.getMessage());
		}
		
		try {
			Set<Produto> listaProdutosEmp5 = new HashSet<Produto>();		
					
			Usuario user5=new Usuario("Maria Helena da Silva","33333333333");
			
			Emprestimo emp5 = new Emprestimo(user5, listaProdutosEmp5);		
			emp5.setDataDevolucao(LocalDateTime.of(2022, 6, 30, 11, 00));
			EmprestimoController.incluir(emp5);
		} catch (CpfInvalidoException | UsuarioNuloException | EmprestimoSemProdutoException e) {
			System.out.println("[ERROR - Emprestimo ] " + e.getMessage());
		}
		
		
		try {
			Set<Produto> listaProdutosEmp6 = null;
			
			Usuario user6=new Usuario("Maria Helena da Silva","33333333333");
			
			Emprestimo emp6 = new Emprestimo(user6, listaProdutosEmp6);		
			emp6.setDataDevolucao(LocalDateTime.of(2022, 6, 30, 11, 00));
			EmprestimoController.incluir(emp6);
		} catch (CpfInvalidoException | UsuarioNuloException | EmprestimoSemProdutoException e) {
			System.out.println("[ERROR - Emprestimo ] " + e.getMessage());
		}
		
	}

}
