package br.edu.infnet.appemprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;
import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.service.MaterialDigitalService;

@Controller
public class MaterialDigitalController {
	@Autowired
	private MaterialDigitalService mdService;
		
	@GetMapping(value= "/MaterialDigital/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
		model.addAttribute("listagemMaterialDigital",mdService.obterLista(usuario));		
		return "/MaterialDigital/lista";
	}	
	@GetMapping(value= "/MaterialDigital")
	public String telaCadastro(){				
		return "/MaterialDigital/cadastro";
	}

	@PostMapping(value= "/MaterialDigital/Incluir")
	public String incluir(MaterialDigital materialDigital, @SessionAttribute("user") Usuario usuario){				
		materialDigital.setUsuario(usuario);
		mdService.incluir(materialDigital);	
		return "redirect:/";
	}
	@GetMapping(value="/MaterialDigital/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		mdService.excluir(id);
		return "redirect:/MaterialDigital/lista";
	}
}

