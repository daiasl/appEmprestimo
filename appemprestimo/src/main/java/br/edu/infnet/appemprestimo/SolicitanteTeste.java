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

import br.edu.infnet.appemprestimo.model.domain.Solicitante;
import br.edu.infnet.appemprestimo.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appemprestimo.model.service.SolicitanteService;

@Component
@Order(1)
public class SolicitanteTeste implements ApplicationRunner {
	@Autowired
	private SolicitanteService solicitanteService;
		
	@Override
	public void run(ApplicationArguments args)  {
		
		String dir = "C:\\dev\\pos-live\\appemprestimo\\src\\main\\resources\\arquivos\\";
		String arq = "Solicitantes.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha =leitura.readLine(); 
				while(linha !=null) {
					try {
						String[] campos= linha.split(";");	
										
						Solicitante sol1 = new Solicitante(campos[0],campos[1]);
						solicitanteService.incluir(sol1);
						
					} catch (CpfInvalidoException e) {
						System.out.println("[ERROR - Solicitante ] " + e.getMessage());
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
