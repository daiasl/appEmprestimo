package br.edu.infnet.appemprestimo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appemprestimo.controller.UsuarioController;
import br.edu.infnet.appemprestimo.model.domain.Usuario;

@Component
@Order(1)
public class UsuarioTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args)  {
		
		Usuario usuario = new Usuario();
		usuario.setEmail("admin@admin.com");
		usuario.setNome("Administrador");
		usuario.setSenha("123");
		UsuarioController.incluir(usuario);	
		
	}

}
