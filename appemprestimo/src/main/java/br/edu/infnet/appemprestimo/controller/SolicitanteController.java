package br.edu.infnet.appemprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appemprestimo.model.domain.Solicitante;
import br.edu.infnet.appemprestimo.model.service.SolicitanteService;

@Controller
public class SolicitanteController {
	@Autowired
	private SolicitanteService solicitanteService;
	
	@GetMapping(value= "/Solicitante/lista")
	public String telaLista(Model model){
		model.addAttribute("listagem",solicitanteService.obterLista());		
		return "/Solicitante/lista";
	}
	
	@GetMapping(value= "/Solicitante")
	public String telaCadastro(){				
		return "/Solicitante/cadastro";
	}

	@PostMapping(value= "/Solicitante/Incluir")
	public String incluir(Solicitante solicitante){				
		solicitanteService.incluir(solicitante);		
		return "redirect:/Solicitante/lista";
	}
	
	@GetMapping(value="/Solicitante/{id}/Excluir")
	public String excluir(@PathVariable Integer id) {
		solicitanteService.excluir(id);
		return "redirect:/Solicitante/lista";
	}
	
	
}
