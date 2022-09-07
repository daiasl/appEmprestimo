package br.edu.infnet.appemprestimo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appemprestimo.model.domain.Livro;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Service
public class LivroService {
	private static Map<Integer, Livro> mapaLivro = new HashMap<Integer, Livro>();	
	private static Integer id=1; 	
	
	public void incluir(Livro livro) {			
		livro.setId(id++);
		mapaLivro.put(livro.getId(), livro);		
		AppImpressao.relatorio("Inclusão do Livro "+ livro.getTitulo() +" realizada com sucesso. ", livro);
	}
	public Collection<Livro> obterLista() {
		return mapaLivro.values();
	}	
	public void excluir(Integer id){
		mapaLivro.remove(id);
	}
}
