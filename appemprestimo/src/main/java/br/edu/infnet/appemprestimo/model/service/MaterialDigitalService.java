package br.edu.infnet.appemprestimo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Service
public class MaterialDigitalService {
	
	private static Map<Integer, MaterialDigital> mapaMaterialDigital = new HashMap<Integer, MaterialDigital>();	
	private static Integer id=1; 	

	public void incluir(MaterialDigital materialDigital) {			
		materialDigital.setId(id++);
		mapaMaterialDigital.put(materialDigital.getId(), materialDigital);		
		AppImpressao.relatorio("Inclusão do Material Digital "+ materialDigital.getTitulo() +" realizada com sucesso. ", materialDigital);
	}
	public Collection<MaterialDigital> obterLista() {
		return mapaMaterialDigital.values();
	}	
	public void excluir(Integer id){
		mapaMaterialDigital.remove(id);
	}
}
