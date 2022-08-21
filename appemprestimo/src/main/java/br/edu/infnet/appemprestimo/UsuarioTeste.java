package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.controller.UsuarioController;
import br.edu.infnet.appemprestimo.model.domain.Usuario;

@Component
@Order(1)
public class UsuarioTeste  implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario user1=new Usuario();
		user1.setNome("João da Silva");
		user1.setCpf("11111111111");
		UsuarioController.incluir(user1);
		
		Usuario user2=new Usuario();
		user2.setNome("Ana de Souza Pereira");
		user2.setCpf("22222222222");
		UsuarioController.incluir(user2);
		
		Usuario user3=new Usuario();
		user3.setNome("Maria Helena da Silva");
		user3.setCpf("33333333333");
		UsuarioController.incluir(user3);		
	}

}
