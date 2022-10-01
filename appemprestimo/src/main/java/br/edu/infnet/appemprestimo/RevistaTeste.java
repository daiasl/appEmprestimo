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
import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.service.RevistaService;

@Component
@Order(5)
public class RevistaTeste implements ApplicationRunner {
	@Autowired
	private RevistaService revistaService;
	
	@Override
	public void run(ApplicationArguments args) {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
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
							Revista revista=new Revista();
							revista.setIssn(campos[1]);
							revista.setEdicao(Integer.valueOf(campos[2]));
							revista.setAno(Integer.valueOf(campos[3]));
							revista.setTitulo(campos[4]);
							revista.setEstante(Integer.valueOf(campos[5]));
							revista.setCodigoBarras(campos[6]);
							revista.setQtdDisponiveis(Integer.valueOf(campos[7]));
							revista.setQtdExemplares(Integer.valueOf(campos[8]));	
							revista.setUsuario(usuario);
							System.out.println("Calcula qtd. produto emprestado: " + revista.CalculaQtdProdutoEmprestado());
							revistaService.incluir(revista);
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
