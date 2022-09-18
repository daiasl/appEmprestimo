package br.edu.infnet.appemprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;
import br.edu.infnet.appemprestimo.model.service.EmprestimoService;
import br.edu.infnet.appemprestimo.model.service.ProdutoService;
import br.edu.infnet.appemprestimo.model.service.SolicitanteService;

@Controller
public class EmprestimoController {
	@Autowired
	private EmprestimoService emprestimoService;
	@Autowired
	private SolicitanteService solicitanteService;
	@Autowired
	private ProdutoService produtoService;
		
	@GetMapping(value= "/Emprestimo/lista")
	public String telaLista(Model model){
		model.addAttribute("listagemEmprestimo",emprestimoService.obterLista());		
		return "/Emprestimo/lista";
	}	
	
	@GetMapping(value= "/Emprestimo")
	public String telaCadastro(Model model){
		model.addAttribute("listagemSolicitantes",solicitanteService.obterLista());
		model.addAttribute("listagemProdutos",produtoService.obterLista());
		return "/Emprestimo/cadastro";
	}

	@PostMapping(value= "/Emprestimo/Incluir")
	public String incluir(Emprestimo emprestimo){				
		emprestimoService.incluir(emprestimo);	
		return "redirect:/";
	}
	
	@GetMapping(value="/Emprestimo/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		emprestimoService.excluir(id);
		return "redirect:/Emprestimo/lista";
	}
}

