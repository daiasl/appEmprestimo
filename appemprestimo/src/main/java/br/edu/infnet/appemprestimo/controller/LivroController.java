package br.edu.infnet.appemprestimo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;


@Controller
public class LivroController {				
	private static Map<Integer, Livro> mapaLivro = new HashMap<Integer, Livro>();	
	private static Integer id=1; 	
	
	public static void incluir(Livro livro) {			
		livro.setId(id++);
		mapaLivro.put(livro.getId(), livro);		
		AppImpressao.relatorio("Inclusão do Livro "+ livro.getTitulo() +" realizada com sucesso. ", livro);
	}
	public static Collection<Livro> obterLista() {
		return mapaLivro.values();
	}	
	public static void excluir(Integer id){
		mapaLivro.remove(id);
	}
		
	@GetMapping(value= "/Livro/lista")
	public String telaLista(Model model){
		model.addAttribute("listagem",obterLista());		
		return "/Livro/lista";
	}	
	@GetMapping(value="/Livro/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/Livro/lista";
	}
}

