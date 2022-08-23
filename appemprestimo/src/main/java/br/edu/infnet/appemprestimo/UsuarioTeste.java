package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.exceptions.CpfInvalidoException;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Component
@Order(1)
public class UsuarioTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args)  {
		Usuario user1;
		try {
			user1 = new Usuario("João da Silva","11111111111");
			AppImpressao.relatorio("Usuario 1", user1);
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR - USUARIO ] " + e.getMessage());
		}
		
		Usuario user2;
		try {
			user2 = new Usuario("Ana de Souza Pereira","22222222222");
			AppImpressao.relatorio("Usuario 2", user2);
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR - USUARIO ] " + e.getMessage());
		}
		
		
		Usuario user3;
		try {
			user3 = new Usuario("Maria Helena da Silva","33333333333");
			AppImpressao.relatorio("Usuario 3", user3);
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR - USUARIO ] " + e.getMessage());
		}
		
		
		Usuario user4;
		try {
			user4 = new Usuario("Maria Silva",null);
			AppImpressao.relatorio("Usuario 4", user4);
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR - USUARIO ] " + e.getMessage());
		}
				
		Usuario user5;
		try {
			user5 = new Usuario("Maria da Silva","");
			AppImpressao.relatorio("Usuario 5", user5);
		} catch (CpfInvalidoException e) {
			System.out.println("[ERROR - USUARIO ] " + e.getMessage());
		}
		
	}

}
