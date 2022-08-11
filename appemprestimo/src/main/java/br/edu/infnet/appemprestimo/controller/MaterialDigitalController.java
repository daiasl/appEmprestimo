package br.edu.infnet.appemprestimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaterialDigitalController {
	
	@GetMapping(value= "/MaterialDigital/lista")
	public String telaLista(){
		return "/MaterialDigital/lista";
	}
}

