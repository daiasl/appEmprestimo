package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Usuario;

@Component
@Order(1)
public class UsuarioTeste  implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario user1=new Usuario(1,"João da Silva","11111111111");
		System.out.println(user1);
		
		Usuario user2=new Usuario(2,"Ana de Souza Pereira","22222222222");
		System.out.println(user2);
		
		Usuario user3=new Usuario(3,"Maria Helena da Silva","33333333333");
		System.out.println(user3);		
	}

}
