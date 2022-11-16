package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Livro;
import br.edu.infnet.orm.modelo.entidade.Produto;


public class ProdutoDAO extends JpaDAO<Produto> {

	public List<Livro> listarProdutoPorTitulo(){
		return em.createQuery("from Livro").getResultList();
	}
	
}
