package br.edu.infnet.appemprestimo.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appemprestimo.model.domain.Emprestimo;
import br.edu.infnet.appemprestimo.model.test.AppImpressao;

@Service
public class EmprestimoService {
	private static Map<Integer, Emprestimo> mapaEmprestimo = new HashMap<Integer, Emprestimo>();
	private static Integer id=1; 	

	public void incluir(Emprestimo emprestimo) {			
		emprestimo.setId(id++);
		mapaEmprestimo.put(emprestimo.getId(), emprestimo);		
		AppImpressao.relatorio("Empréstimo realizado com sucesso.", emprestimo);
	}
	public Collection<Emprestimo> obterLista() {
		return mapaEmprestimo.values();
	}	
	public void excluir(Integer id){
		mapaEmprestimo.remove(id);
	}
}
