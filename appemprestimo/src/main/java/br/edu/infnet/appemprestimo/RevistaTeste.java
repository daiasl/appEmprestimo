package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Revista;

@Component
public class RevistaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Revista revista1=new Revista();
		revista1.issn="1980393-1";
		revista1.edicao=6;
		revista1.ano=2011;
		System.out.println(revista1);
		//.net magazine
		
		Revista revista2=new Revista();
		revista2.issn="2357-7886";
		revista2.edicao=138;
		revista2.ano=2021;
		System.out.println(revista2);
		//revista wine

		Revista revista3=new Revista();
		revista3.issn="456-7890";
		revista3.edicao=1;
		revista3.ano=2022;
		System.out.println(revista3);
		//revista fake

		
	}

}
