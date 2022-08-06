package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Livro;

@Component
public class LivroTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Livro livro1 = new Livro();
		livro1.isbn="987-85-508-1500-8";
		livro1.volume=1;
		livro1.edicao=1;
		livro1.anoPublicacao=2020;
		livro1.nomeAutor="Robert C. Martin";
		System.out.println(livro1);
		
		Livro livro2 = new Livro();
		livro2.isbn="987-5-01-30451-3";
		livro2.volume=1;
		livro2.edicao=2;
		livro2.anoPublicacao=2020;
		livro2.nomeAutor="Kate Quinn";
		System.out.println(livro2);
		
		Livro livro3 = new Livro();
		livro3.isbn="987-65-5564-024-3";
		livro3.volume=1;
		livro3.edicao=1;
		livro3.anoPublicacao=2020;
		livro3.nomeAutor="Daiana Garbin";
		System.out.println(livro3);
		
	}

}
