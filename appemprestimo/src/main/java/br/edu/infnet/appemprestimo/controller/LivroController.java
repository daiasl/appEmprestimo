package br.edu.infnet.appemprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.service.LivroService;

@Controller
public class LivroController {				
	@Autowired
	private LivroService livroService;
	
	@GetMapping(value= "/Livro/lista")
	public String telaLista(Model model){
		model.addAttribute("listagem",livroService.obterLista());		
		return "/Livro/lista";
	}
	
	@GetMapping(value= "/Livro")
	public String telaCadastro(){				
		return "/Livro/cadastro";
	}

	@PostMapping(value= "/Livro/Incluir")
	public String incluir(Livro livro){				
		livroService.incluir(livro);	
		return "redirect:/";
	}	
		
	@GetMapping(value="/Livro/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		livroService.excluir(id);
		return "redirect:/Livro/lista";
	}
}

