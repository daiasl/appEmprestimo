package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevistaController {
	
	@GetMapping(value= "/Revista/lista")
	public String telaLista(){
		return "/Revista/lista";
	}
}
