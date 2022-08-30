package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SolicitanteController {
				
	@GetMapping(value= "/Solicitante/lista")
	public String telaLista(){				
		return "/Solicitante/lista";
	}	
	
}
