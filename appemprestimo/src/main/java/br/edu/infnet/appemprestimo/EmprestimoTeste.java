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

@Component
@Order(2)
public class EmprestimoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
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
		
		Set<Produto> listaProdutosEmp1 = new HashSet<Produto>();
		listaProdutosEmp1.add(livro1);
		listaProdutosEmp1.add(livro1);
		listaProdutosEmp1.add(livro2);
		listaProdutosEmp1.add(livro2);
		listaProdutosEmp1.add(md1);
		listaProdutosEmp1.add(revista1);
		
		Usuario user1=new Usuario();
		user1.setNome("João da Silva");
		user1.setCpf("11111111111");
		
		Emprestimo emp1 = new Emprestimo(user1);
		emp1.setDataDevolucao(null);		
		emp1.setProdutos(listaProdutosEmp1);	
		EmprestimoController.incluir(emp1);
				
		Set<Produto> listaProdutosEmp2 = new HashSet<Produto>();
		listaProdutosEmp2.add(livro1);
		listaProdutosEmp2.add(md1);		
		
		user1.setNome("Ana de Souza Pereira");
		user1.setCpf("22222222222");
		
		Emprestimo emp2 = new Emprestimo(user1);
		emp2.setDataDevolucao(LocalDateTime.of(2022, 8, 1, 10, 42));
		emp2.setProdutos(listaProdutosEmp2);		
		EmprestimoController.incluir(emp2);
				
		Set<Produto> listaProdutosEmp3 = new HashSet<Produto>();		
		listaProdutosEmp3.add(revista1);
		
		user1.setNome("Maria Helena da Silva");
		user1.setCpf("33333333333");
		
		Emprestimo emp3 = new Emprestimo(user1);		
		emp3.setDataDevolucao(LocalDateTime.of(2022, 6, 30, 11, 00));
		emp3.setProdutos(listaProdutosEmp3);		
		EmprestimoController.incluir(emp3);	
	}

}
