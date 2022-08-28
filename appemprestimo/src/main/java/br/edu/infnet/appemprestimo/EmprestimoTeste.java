package br.edu.infnet.appemprestimo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		
		String dir = "C:\\dev\\pos-live\\appemprestimo\\src\\main\\resources\\arquivos\\";
		String arq = "Emprestimos.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha =leitura.readLine(); 
				while(linha !=null) {
					try {
						String[] campos= linha.split(";");						
												
						Set<Produto> listaProdutosEmp1 = new HashSet<Produto>();
						listaProdutosEmp1.add(livro1);
						listaProdutosEmp1.add(livro1);
						listaProdutosEmp1.add(livro2);
						listaProdutosEmp1.add(livro2);
						listaProdutosEmp1.add(md1);
						listaProdutosEmp1.add(revista1);
						
						Usuario user1 = new Usuario(campos[5],campos[6]);
						
						Emprestimo emp1 = new Emprestimo(user1,listaProdutosEmp1);
						emp1.setDataDevolucao(LocalDateTime.of(Integer.valueOf(campos[0]), Integer.valueOf(campos[1]), Integer.valueOf(campos[2]), Integer.valueOf(campos[3]), Integer.valueOf(campos[4])));
						EmprestimoController.incluir(emp1);			
					} catch (CpfInvalidoException | UsuarioNuloException | EmprestimoSemProdutoException e) {
						System.out.println("[ERROR - Emprestimo ] " + e.getMessage());
					}
					linha =leitura.readLine();
				}				
				
				leitura.close();
				fileReader.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe!!!"); 
			} catch (IOException e) {
				System.out.println("[ERRO] Problema ao fechar o arquivo!!!");
			}	
		} finally {
			System.out.println("Fim da inclusão!");
		}
			
	}

}
