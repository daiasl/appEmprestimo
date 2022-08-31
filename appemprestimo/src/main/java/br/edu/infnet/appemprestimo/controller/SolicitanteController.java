package br.edu.infnet.appemprestimo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appemprestimo.model.domain.Solicitante;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Controller
public class SolicitanteController {
				
	private static Map<Integer, Solicitante> mapaSolicitante = new HashMap<Integer, Solicitante>();
	private static Integer id=1; 	
	
	public static void incluir(Solicitante solicitante) {			
		solicitante.setId(id++);
		mapaSolicitante.put(solicitante.getId(), solicitante);		
		AppImpressao.relatorio("Inclusão do solicitante "+ solicitante.getNome() +" realizada com sucesso. ", solicitante);
	}
	public static Collection<Solicitante> obterLista() {
		return mapaSolicitante.values();
	}	
	public static void excluir(Integer id){
		mapaSolicitante.remove(id);
	}
		
	@GetMapping(value= "/Solicitante/lista")
	public String telaLista(Model model){
		model.addAttribute("listagem",obterLista());		
		return "/Solicitante/lista";
	}	
	@GetMapping(value="/Solicitante/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/Solicitante/lista";
	}
	
	
}
