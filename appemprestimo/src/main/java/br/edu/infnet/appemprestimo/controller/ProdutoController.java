package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
	
	@GetMapping(value= "/Produto/lista")
	public String telaLista(){
		return "/Produto/lista";
	}
}