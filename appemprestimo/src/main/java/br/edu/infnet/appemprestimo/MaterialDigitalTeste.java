package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;

@Component
public class MaterialDigitalTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//https://www.scielo.br/j/rac/a/KD5zxt6DTqnKQ9GMzqXK4tf/?lang=pt&stop=next&format=html
		//Sistemas de Informação no Brasil: uma análise dos artigos científicos dos anos 90
		//Norberto Hoppen
		MaterialDigital md1 = new MaterialDigital();
		md1.doi= "10.1590/S1415";
		md1.ano=1998;
		md1.volume=1;
		md1.linkDoi = "https://doi.org/10.1590/S1415-65551998000300009";
		System.out.println(md1);
		
		//https://www.scielo.br/j/ci/a/ynWdGF5Lfsr4mJdCtQs3pQf/?format=html&lang=pt
		//As redes cognitivas na ciência da informação brasileira: um estudo nos artigos científicos publicados nos periódicos da área
		//Liliane Vieira Pinheiro
		MaterialDigital md2 = new MaterialDigital();
		md2.doi= "10.1590/S0100";
		md2.ano=2008;
		md2.volume=1;
		md2.linkDoi = "https://doi.org/10.1590/S0100-19652008000300003";
		System.out.println(md2);
				
		//https://www.scielosp.org/article/csc/2022.v27n1/351-361/pt/
		//Perspectivas acerca do conceito de saúde mental: análise das produções científicas brasileiras
		//Vírnia Ponte Alcântara
		MaterialDigital md3 = new MaterialDigital();
		md3.doi= "10.1590/1413";
		md3.ano=2022;
		md3.volume=1;
		md3.linkDoi = "https://doi.org/10.1590/1413-81232022271.22562019";
		System.out.println(md3);
		
	}

}
