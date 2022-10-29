package br.edu.infnet.emprestimo.modelo.persistencia;

import java.util.List;

import br.edu.infnet.emprestimo.modelo.entidades.Produto;

public class ProdutoDAO extends JdbcDAO<Produto>{

	@Override
	public boolean incluir(Produto obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean atualizar(Produto obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletar(Produto obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto obter(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
