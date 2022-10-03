package br.edu.infnet.appemprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;
import br.edu.infnet.appemprestimo.model.domain.Produto;
import br.edu.infnet.appemprestimo.model.domain.Usuario;
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
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario){
		model.addAttribute("solicitantes",solicitanteService.obterLista(usuario));
		model.addAttribute("produtos",produtoService.obterLista(usuario));
		return "/Emprestimo/cadastro";
	}

	@PostMapping(value= "/Emprestimo/Incluir")
	public String incluir(Emprestimo emprestimo){				
		emprestimoService.incluir(emprestimo);
		System.out.println("Emp.id=" + emprestimo.getId());
		System.out.println("Emp.sol.nome=" + emprestimo.getSolicitante().getNome());
		System.out.println("Emp.prod.size=" + emprestimo.getProdutos().size());
		for (Produto produto : emprestimo.getProdutos()) {
			System.out.println("Emp.prod.id=" + produto.getId());
			System.out.println("Emp.prod.titulo=" + produto.getTitulo());
		}
		
		return "redirect:/Emprestimo/lista";
	}
	
	@GetMapping(value="/Emprestimo/{id}/Excluir")
	public String excluir(@PathVariable Integer id) {
		emprestimoService.excluir(id);
		return "redirect:/Emprestimo/lista";
	}
		
}

