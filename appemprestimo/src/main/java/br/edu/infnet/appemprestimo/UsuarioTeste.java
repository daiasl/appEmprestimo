package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Component
@Order(1)
public class UsuarioTeste  implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario user1=new Usuario("João da Silva","11111111111");
		AppImpressao.relatorio("Usuario 1", user1);
		
		Usuario user2=new Usuario("Ana de Souza Pereira","22222222222");
		AppImpressao.relatorio("Usuario 2", user2);
		
		Usuario user3=new Usuario("Maria Helena da Silva","33333333333");
		AppImpressao.relatorio("Usuario 3", user3);		
	}

}
