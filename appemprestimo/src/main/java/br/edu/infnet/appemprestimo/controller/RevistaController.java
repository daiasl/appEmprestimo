package br.edu.infnet.appemprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appemprestimo.model.domain.Revista;
import br.edu.infnet.appemprestimo.model.service.RevistaService;

@Controller
public class RevistaController {
	@Autowired
	private RevistaService revistaService;
		
	@GetMapping(value= "/Revista/lista")
	public String telaLista(Model model){
		model.addAttribute("listagemRevista",revistaService.obterLista());		
		return "/Revista/lista";
	}	
	@GetMapping(value= "/Revista")
	public String telaCadastro(){				
		return "/Revista/cadastro";
	}

	@PostMapping(value= "/Revista/Incluir")
	public String incluir(Revista revista){				
		revistaService.incluir(revista);	
		return "redirect:/";
	}
	@GetMapping(value="/Revista/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		revistaService.excluir(id);
		return "redirect:/Revista/lista";
	}
}
