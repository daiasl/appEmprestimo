package br.edu.infnet.appemprestimo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appemprestimo.model.domain.Revista;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Service
public class RevistaService {
	private static Map<Integer, Revista> mapaRevista = new HashMap<Integer, Revista>();
	private static Integer id=1; 	
	
	public void incluir(Revista revista) {			
		revista.setId(id++);
		mapaRevista.put(revista.getId(), revista);		
		AppImpressao.relatorio("Inclusão da revista "+ revista.getTitulo() +" realizada com sucesso. ", revista);
	}
	public Collection<Revista> obterLista() {
		return mapaRevista.values();
	}	
	public void excluir(Integer id){
		mapaRevista.remove(id);
	}
}
