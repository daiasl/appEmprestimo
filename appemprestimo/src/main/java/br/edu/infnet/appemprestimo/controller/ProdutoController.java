package br.edu.infnet.appemprestimo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appemprestimo.model.domain.Produto;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Controller
public class ProdutoController {
	
	private static Map<Integer, Produto> mapaProduto = new HashMap<Integer, Produto>();
	private static Integer id=1; 	

	public static void incluir(Produto produto) {			
		produto.setId(id++);
		
		mapaProduto.put(produto.getId(), produto);		
		AppImpressao.relatorio("Inclusão do produto "+ produto.getTitulo() +" realizado com sucesso. ", produto);
	}
	public static Collection<Produto> obterLista() {
		return mapaProduto.values();
	}	
	public static void excluir(Integer id){
		mapaProduto.remove(id);
	}
		
	@GetMapping(value= "/Produto/lista")
	public String telaLista(Model model){
		model.addAttribute("listagemProduto",obterLista());		
		return "/Produto/lista";
	}	
	@GetMapping(value="/Produto/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/Produto/lista";
	}
}