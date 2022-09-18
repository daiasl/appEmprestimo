package br.edu.infnet.appemprestimo.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appemprestimo.model.domain.Produto;

@Service
public class ProdutoService {
	@Autowired
	private LivroService livroService;
	@Autowired
	private MaterialDigitalService mdService;
	
	public List<Produto> obterLista() {
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.addAll(livroService.obterLista());
		produtos.addAll(mdService.obterLista());
			
		return produtos;
	}
}
