package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
				
	@GetMapping(value= "/Usuario/lista")
	public String telaLista(){				
		return "/Usuario/lista";
	}	
	
}
