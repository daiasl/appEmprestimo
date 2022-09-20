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
import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appemprestimo.model.service.SolicitanteService;

@Component
@Order(2)
public class SolicitanteTeste implements ApplicationRunner {
	@Autowired
	private SolicitanteService solicitanteService;
		
	@Override
	public void run(ApplicationArguments args)  {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
				
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
										
						Solicitante solicitante = new Solicitante(campos[0],campos[1]);
						solicitante.setUsuario(usuario);
						
						solicitanteService.incluir(solicitante);
						
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
