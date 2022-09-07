package br.edu.infnet.appemprestimo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.exceptions.AnoPublicacaoInvalidoException;
import br.edu.infnet.appemprestimo.model.service.LivroService;

@Component
@Order(3)
public class LivroTeste implements ApplicationRunner {
	@Autowired
	private LivroService livroService;
	
	@Override
	public void run(ApplicationArguments args) {
		
		String dir = "C:\\dev\\pos-live\\appemprestimo\\src\\main\\resources\\arquivos\\";
		String arq = "Livros.txt";
		
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha =leitura.readLine(); 
				while(linha !=null) {
					try {
						String[] campos= linha.split(";");	
						
						Livro livro1 = new Livro();
						livro1.setIsbn(campos[0]);
						livro1.setVolume(Integer.valueOf(campos[1]));
						livro1.setEdicao(Integer.valueOf(campos[2]));
						livro1.setAnoPublicacao(Integer.valueOf(campos[3]));
						livro1.setNomeAutor(campos[4]);
						livro1.setTitulo(campos[5]);
						livro1.setEstante(Integer.valueOf(campos[6]));
						livro1.setCodigoBarras(campos[7]);
						livro1.setQtdDisponiveis(Integer.valueOf(campos[8]));
						livro1.setQtdExemplares(Integer.valueOf(campos[9]));
						System.out.println("Calcula qtd. produto emprestado: " + livro1.CalculaQtdProdutoEmprestado());
						livroService.incluir(livro1);
					} catch (AnoPublicacaoInvalidoException e) {
						System.out.println("[ERROR - Livro] " + e.getMessage());
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
