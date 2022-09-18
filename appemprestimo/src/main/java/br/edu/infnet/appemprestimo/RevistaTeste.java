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

import br.edu.infnet.appemprestimo.model.domain.Revista;
import br.edu.infnet.appemprestimo.model.service.RevistaService;

@Component
@Order(4)
public class RevistaTeste implements ApplicationRunner {
	@Autowired
	private RevistaService revistaService;
	
	@Override
	public void run(ApplicationArguments args) {
		
		String dir = "C:\\dev\\pos-live\\appemprestimo\\src\\main\\resources\\arquivos\\";
		String arq = "Produtos.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha =leitura.readLine(); 
				while(linha !=null) {
					String[] campos= linha.split(";");
				
					if ("R".equalsIgnoreCase(campos[0])) {
						try {
							Revista revista1=new Revista();
							revista1.setIssn(campos[1]);
							revista1.setEdicao(Integer.valueOf(campos[2]));
							revista1.setAno(Integer.valueOf(campos[3]));
							revista1.setTitulo(campos[4]);
							revista1.setEstante(Integer.valueOf(campos[5]));
							revista1.setCodigoBarras(campos[6]);
							revista1.setQtdDisponiveis(Integer.valueOf(campos[7]));
							revista1.setQtdExemplares(Integer.valueOf(campos[8]));	
							System.out.println("Calcula qtd. produto emprestado: " + revista1.CalculaQtdProdutoEmprestado());
							revistaService.incluir(revista1);
						} catch (Exception e) {
							System.out.println("[ERROR - Revista] " + e.getMessage());
						}	
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
