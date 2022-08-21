package br.edu.infnet.appemprestimo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Controller
public class EmprestimoController {
	
	private static Map<Integer, Emprestimo> mapaEmprestimo = new HashMap<Integer, Emprestimo>();
	private static Integer id=1; 	

	public static void incluir(Emprestimo emprestimo) {			
		emprestimo.setId(id++);
		mapaEmprestimo.put(emprestimo.getId(), emprestimo);		
		AppImpressao.relatorio("Empréstimo realizado com sucesso.", emprestimo);
	}
	public static Collection<Emprestimo> obterLista() {
		return mapaEmprestimo.values();
	}	
	public static void excluir(Integer id){
		mapaEmprestimo.remove(id);
	}
		
	@GetMapping(value= "/Emprestimo/lista")
	public String telaLista(Model model){
		model.addAttribute("listagemEmprestimo",obterLista());		
		return "/Emprestimo/lista";
	}	
	@GetMapping(value="/Emprestimo/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/Emprestimo/lista";
	}
}

