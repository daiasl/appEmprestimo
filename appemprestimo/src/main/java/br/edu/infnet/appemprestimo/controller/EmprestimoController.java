package br.edu.infnet.appemprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;
import br.edu.infnet.appemprestimo.model.service.EmprestimoService;

@Controller
public class EmprestimoController {
	@Autowired
	private EmprestimoService emprestimoService;
		
	@GetMapping(value= "/Emprestimo/lista")
	public String telaLista(Model model){
		model.addAttribute("listagemEmprestimo",emprestimoService.obterLista());		
		return "/Emprestimo/lista";
	}	
	
	@GetMapping(value= "/Emprestimo")
	public String telaCadastro(){				
		return "/Emprestimo/cadastro";
	}

	@PostMapping(value= "/Emprestimo/Incluir")
	public String incluir(Emprestimo Emprestimo){				
		emprestimoService.incluir(Emprestimo);	
		return "redirect:/";
	}
	
	@GetMapping(value="/Emprestimo/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		emprestimoService.excluir(id);
		return "redirect:/Emprestimo/lista";
	}
}

