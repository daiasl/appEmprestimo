package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Component
@Order(3)
public class LivroTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Livro livro1 = new Livro();
		livro1.setIsbn("987-85-508-1500-8");
		livro1.setVolume(1);
		livro1.setEdicao(1);
		livro1.setAnoPublicacao(2020);
		livro1.setNomeAutor("Robert C. Martin");
		livro1.setTitulo("Desenvolvimento de Software Ágil");
		livro1.setEstante(1);
		livro1.setCodigoBarras("9788550815008");
		livro1.setQtdDisponiveis(5);
		livro1.setQtdExemplares(6);				
		
		AppImpressao.relatorio("Livro 1", livro1);
		
		Livro livro2 = new Livro();
		livro2.setIsbn("987-5-01-30451-3");
		livro2.setVolume(1);
		livro2.setEdicao(2);
		livro2.setAnoPublicacao(2022);
		livro2.setNomeAutor("Kate Quinn");
		livro2.setTitulo("A Rede de Alice");
		livro2.setEstante(2);
		livro2.setCodigoBarras("978850304513");
		livro2.setQtdDisponiveis(3);
		livro2.setQtdExemplares(10);
				
		AppImpressao.relatorio("Livro 2",livro2);
		
		Livro livro3 = new Livro();
		livro3.setIsbn("987-65-5564-024-3");
		livro3.setVolume(1);
		livro3.setEdicao(1);
		livro3.setAnoPublicacao(2020);
		livro3.setNomeAutor("Daiana Garbin");
		livro3.setTitulo("A vida perfeita não existe");
		livro3.setEstante(3);
		livro3.setCodigoBarras("9786555640243");
		livro3.setQtdDisponiveis(2);
		livro3.setQtdExemplares(2);
		
		AppImpressao.relatorio("Livro 3",livro3);
		
	}

}
