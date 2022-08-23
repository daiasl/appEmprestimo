package br.edu.infnet.appemprestimo.controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appemprestimo.model.domain.Produto;

@Controller
public class ProdutoController {

	public static Collection<Produto> obterLista() {		
		return null;
	}
	
	@GetMapping(value= "/Produto/lista")
	public String telaLista(Model model) {
		///model.addAttribute("listagemProduto",obterLista());
		return "/Produto/lista";
	}	
	
}