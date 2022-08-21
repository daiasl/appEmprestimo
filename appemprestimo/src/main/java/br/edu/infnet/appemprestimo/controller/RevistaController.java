package br.edu.infnet.appemprestimo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appemprestimo.model.domain.Revista;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Controller
public class RevistaController {
	
	private static Map<Integer, Revista> mapaRevista = new HashMap<Integer, Revista>();
	private static Integer id=1; 	
	
	public static void incluir(Revista revista) {			
		revista.setId(id++);
		mapaRevista.put(revista.getId(), revista);		
		AppImpressao.relatorio("Inclusão da revista "+ revista.getTitulo() +" realizada com sucesso. ", revista);
	}
	public static Collection<Revista> obterLista() {
		return mapaRevista.values();
	}	
	public static void excluir(Integer id){
		mapaRevista.remove(id);
	}
		
	@GetMapping(value= "/Revista/lista")
	public String telaLista(Model model){
		model.addAttribute("listagemRevista",obterLista());		
		return "/Revista/lista";
	}	
	@GetMapping(value="/Revista/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/Revista/lista";
	}
}
