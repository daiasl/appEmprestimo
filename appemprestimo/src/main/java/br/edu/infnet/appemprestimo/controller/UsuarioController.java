package br.edu.infnet.appemprestimo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appemprestimo.model.domain.Usuario;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Controller
public class UsuarioController {
	
	private static Map<Integer, Usuario> mapaUsuario = new HashMap<Integer, Usuario>();
	private static Integer id=1; 	

	public static void incluir(Usuario usuario) {			
		usuario.setId(id++);
		mapaUsuario.put(usuario.getId(), usuario);		
		AppImpressao.relatorio("Inclusão do usuário " + usuario.getId() + " realizado com sucesso.", usuario);
	}
	public static Collection<Usuario> obterLista() {
		return mapaUsuario.values();
	}	
	public static void excluir(Integer id){
		mapaUsuario.remove(id);
	}
		
	@GetMapping(value= "/Usuario/lista")
	public String telaLista(Model model){
		model.addAttribute("listagemUsuario",obterLista());		
		return "/Usuario/lista";
	}	
	@GetMapping(value="/Usuario/{id}/Excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/Usuario/lista";
	}
}
