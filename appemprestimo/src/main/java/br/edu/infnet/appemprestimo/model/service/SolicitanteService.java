package br.edu.infnet.appemprestimo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appemprestimo.model.domain.Solicitante;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Service
public class SolicitanteService {
	private static Map<Integer, Solicitante> mapaSolicitante = new HashMap<Integer, Solicitante>();
	private static Integer id=1; 	
	
	public void incluir(Solicitante solicitante) {			
		solicitante.setId(id++);
		mapaSolicitante.put(solicitante.getId(), solicitante);		
		AppImpressao.relatorio("Inclusão do solicitante "+ solicitante.getNome() +" realizada com sucesso. ", solicitante);
	}
	public Collection<Solicitante> obterLista() {
		return mapaSolicitante.values();
	}	
	public void excluir(Integer id){
		mapaSolicitante.remove(id);
	}
}
