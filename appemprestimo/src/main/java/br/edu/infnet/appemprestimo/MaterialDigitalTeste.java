package br.edu.infnet.appemprestimo;

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

		try {
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
			System.out.println("Calcula qtd. produto emprestado: " + md1.CalculaQtdProdutoEmprestado());
			MaterialDigitalController.incluir(md1);
		} catch (Exception e) {
			System.out.println("[ERROR - Material Digital] " + e.getMessage());
		}
		
		try {
			MaterialDigital md2 = new MaterialDigital();
			md2.setDoi("10.1590/S0100");
			md2.setAno(2008);
			md2.setVolume(1);
			md2.setLinkDoi("https://doi.org/10.1590/S0100-19652008000300003");
			md2.setTitulo(
					"As redes cognitivas na ciência da informação brasileira: um estudo nos artigos científicos publicados nos periódicos da área");
			md2.setEstante(4);
			md2.setCodigoBarras("");
			md2.setQtdDisponiveis(1);
			md2.setQtdExemplares(1);
			System.out.println("Calcula qtd. produto emprestado: " + md2.CalculaQtdProdutoEmprestado());
			MaterialDigitalController.incluir(md2);
		} catch (Exception e) {
			System.out.println("[ERROR - Material Digital] " + e.getMessage());
		}
		
		try {
			MaterialDigital md3 = new MaterialDigital();
			md3.setDoi("10.1590/1413");
			md3.setAno(2022);
			md3.setVolume(1);
			md3.setLinkDoi("https://doi.org/10.1590/1413-81232022271.22562019");
			md3.setTitulo(
					"Perspectivas acerca do conceito de saúde mental: análise das produções científicas brasileiras");
			md3.setEstante(4);
			md3.setCodigoBarras("");
			md3.setQtdDisponiveis(1);
			md3.setQtdExemplares(1);
			System.out.println("Calcula qtd. produto emprestado: " + md3.CalculaQtdProdutoEmprestado());
			MaterialDigitalController.incluir(md3);
		} catch (Exception e) {
			System.out.println("[ERROR - Material Digital] " + e.getMessage());
		}
		
		try {
			MaterialDigital md4 = new MaterialDigital();
			md4.setDoi("10.1590/1413");
			md4.setAno(2022);
			md4.setVolume(1);
			md4.setLinkDoi("https://doi.org/10.1590/1413-81232022271.22562019");
			md4.setTitulo(
					"Perspectivas acerca do conceito de saúde mental: análise das produções científicas brasileiras");
			md4.setEstante(4);
			md4.setCodigoBarras("");
			md4.setQtdDisponiveis(1);
			md4.setQtdExemplares(0);
			System.out.println("Calcula qtd. produto emprestado: " + md4.CalculaQtdProdutoEmprestado());
			MaterialDigitalController.incluir(md4);
		} catch (Exception e) {
			System.out.println("[ERROR - Material Digital] " + e.getMessage());
		}
		
		try {
			MaterialDigital md5 = new MaterialDigital();
			md5.setDoi("10.1590/1413");
			md5.setAno(2022);
			md5.setVolume(1);
			md5.setLinkDoi("https://doi.org/10.1590/1413-81232022271.22562019");
			md5.setTitulo(
					"Perspectivas acerca do conceito de saúde mental: análise das produções científicas brasileiras");
			md5.setEstante(4);
			md5.setCodigoBarras("");
			md5.setQtdDisponiveis(1);
			md5.setQtdExemplares(-1);
			System.out.println("Calcula qtd. produto emprestado: " + md5.CalculaQtdProdutoEmprestado());
			MaterialDigitalController.incluir(md5);
		} catch (Exception e) {
			System.out.println("[ERROR - Material Digital] " + e.getMessage());
		}


	}

}
