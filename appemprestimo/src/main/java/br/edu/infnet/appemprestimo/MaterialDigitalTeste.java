package br.edu.infnet.appemprestimo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.controller.MaterialDigitalController;
import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;

@Component
@Order(5)
public class MaterialDigitalTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		String dir = "C:\\dev\\pos-live\\appemprestimo\\src\\main\\resources\\arquivos\\";
		String arq = "MateriaisDigitais.txt";

		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha =leitura.readLine(); 
				while(linha !=null) {
					try {
						String[] campos= linha.split(";");	
						
						MaterialDigital md1 = new MaterialDigital();
						md1.setDoi(campos[0]);
						md1.setAno(Integer.valueOf(campos[1]));
						md1.setVolume(Integer.valueOf(campos[2]));
						md1.setLinkDoi(campos[3]);
						md1.setTitulo(campos[4]);
						md1.setEstante(Integer.valueOf(campos[5]));
						md1.setCodigoBarras(campos[6]);
						md1.setQtdDisponiveis(Integer.valueOf(campos[7]));
						md1.setQtdExemplares(Integer.valueOf(campos[8]));
						System.out.println("Calcula qtd. produto emprestado: " + md1.CalculaQtdProdutoEmprestado());
						MaterialDigitalController.incluir(md1);
					} catch (Exception e) {
						System.out.println("[ERROR - Material Digital] " + e.getMessage());
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
