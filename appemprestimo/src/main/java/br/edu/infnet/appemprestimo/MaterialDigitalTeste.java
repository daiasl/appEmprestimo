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

import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;
import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.service.MaterialDigitalService;

@Component
@Order(4)
public class MaterialDigitalTeste implements ApplicationRunner {
	@Autowired
	private MaterialDigitalService mdService;
	
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
					
					if ("M".equalsIgnoreCase(campos[0])) {
						try {
							MaterialDigital md = new MaterialDigital();
							md.setDoi(campos[1]);
							md.setAno(Integer.valueOf(campos[2]));
							md.setVolume(Integer.valueOf(campos[3]));
							md.setLinkDoi(campos[4]);
							md.setTitulo(campos[5]);
							md.setEstante(Integer.valueOf(campos[6]));
							md.setCodigoBarras(campos[7]);
							md.setQtdDisponiveis(Integer.valueOf(campos[8]));
							md.setQtdExemplares(Integer.valueOf(campos[9]));
							md.setUsuario(usuario);
							System.out.println("Calcula qtd. produto emprestado: " + md.CalculaQtdProdutoEmprestado());
							mdService.incluir(md);
						} catch (Exception e) {
							System.out.println("[ERROR - Material Digital] " + e.getMessage());
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
