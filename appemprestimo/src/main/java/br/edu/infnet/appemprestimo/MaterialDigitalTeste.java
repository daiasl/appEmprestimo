package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;

@Component
@Order(5)
public class MaterialDigitalTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
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
		System.out.println(md1);
				
		MaterialDigital md2 = new MaterialDigital();
		md2.setDoi("10.1590/S0100");
		md2.setAno(2008);
		md2.setVolume(1);
		md2.setLinkDoi("https://doi.org/10.1590/S0100-19652008000300003");
		md2.setTitulo("As redes cognitivas na ciência da informação brasileira: um estudo nos artigos científicos publicados nos periódicos da área");
		md2.setEstante(4);
		md2.setCodigoBarras("");
		md2.setQtdDisponiveis(1);
		md2.setQtdExemplares(1);
		System.out.println(md2);
		
		MaterialDigital md3 = new MaterialDigital();
		md3.setDoi("10.1590/1413");
		md3.setAno(2022);
		md3.setVolume(1);
		md3.setLinkDoi("https://doi.org/10.1590/1413-81232022271.22562019");
		md3.setTitulo("Perspectivas acerca do conceito de saúde mental: análise das produções científicas brasileiras");
		md3.setEstante(4);
		md3.setCodigoBarras("");
		md3.setQtdDisponiveis(1);
		md3.setQtdExemplares(1);
		System.out.println(md3);
		
	}

}
