package br.edu.infnet.emprestimo.modelo.persistencia;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.infnet.emprestimo.modelo.entidades.Emprestimo;

public class EmprestimoDAOTest {
	
	@Test
	public void testListarEmprestimos() {
		IDAO emprestimoDAO=new EmprestimoDAO();
		List<Emprestimo> lista = emprestimoDAO.listarTodos();
		System.out.println(lista);
		Assert.assertTrue(lista.size() > 0);
	}
		
}
