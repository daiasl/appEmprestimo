package br.edu.infnet.appemprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import br.edu.infnet.appemprestimo.model.service.AppService;

@SessionAttributes("user")
@Controller
public class AppController {

	@Autowired
	private AppService appService;
	
	@GetMapping(value= "/")
	public String telaHome(Model model){		
		model.addAttribute("projeto", appService.obterProjeto());
		return "home";
	}
	
}
