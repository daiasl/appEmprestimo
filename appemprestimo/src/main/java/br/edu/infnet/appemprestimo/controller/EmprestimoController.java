package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmprestimoController {
	
	@GetMapping(value= "/Emprestimo/lista")
	public String telaLista(){
		return "/Emprestimo/lista";
	}
}

