package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Usuario;

@Component
public class UsuarioTeste  implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario user1=new Usuario();
		user1.id= 1;
		user1.nome="João da Silva";
		user1.cpf="11111111111";
		System.out.println(user1);
		
		Usuario user2=new Usuario();
		user2.id= 1;
		user2.nome="Ana de Souza Pereira";
		user2.cpf="22222222222";
		System.out.println(user2);
		
		Usuario user3=new Usuario();
		user3.id= 1;
		user3.nome="Maria Helena da Silva";
		user3.cpf="33333333333";
		System.out.println(user3);

		
	}

}
