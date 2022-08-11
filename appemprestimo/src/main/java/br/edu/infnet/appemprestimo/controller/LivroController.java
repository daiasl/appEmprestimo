package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivroController {
	
	@GetMapping(value= "/Livro/lista")
	public String telaLista(){
		return "/Livro/lista";
	}
}

