package br.edu.infnet.appemprestimo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Controller
public class MaterialDigitalController {
	private static Map<Integer, MaterialDigital> mapaMaterialDigital = new HashMap<Integer, MaterialDigital>();	
	private static Integer id=1; 	

	public static void incluir(MaterialDigital materialDigital) {			
		materialDigital.setId(id++);
		mapaMaterialDigital.put(materialDigital.getId(), materialDigital);		
		AppImpressao.relatorio("Inclusão do Material Digital "+ materialDigital.getTitulo() +" realizada com sucesso. ", materialDigital);
	}
	public static Collection<MaterialDigital> obterLista() {
		return mapaMaterialDigital.values();
	}	
	public static void excluir(Integer id){
		mapaMaterialDigital.remove(id);
	}
		
	@GetMapping(value= "/MaterialDigital/lista")
	public String telaLista(Model model){
		model.addAttribute("listagemMaterialDigital",obterLista());		
		return "/MaterialDigital/lista";
	}	
	@GetMapping(value="/MaterialDigital/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/MaterialDigital/lista";
	}
}

