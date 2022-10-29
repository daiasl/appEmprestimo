package br.edu.infnet.emprestimo.modelo.persistencia;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.infnet.emprestimo.modelo.entidades.Solicitante;

public class SolicitanteDAOTest {

	@Before
	public void inicializar() {
		IDAO solicitanteDao=new SolicitanteDAO();
		Solicitante solicitante=new Solicitante("José Mendes", "11111111111");
		solicitanteDao.incluir(solicitante);
	}
	
	@Test
	public void testIncluir() {
		IDAO solicitanteDao=new SolicitanteDAO();
		Solicitante solicitante=new Solicitante("João da Silva", "99999999999");
		boolean validacao = solicitanteDao.incluir(solicitante);
		Assert.assertTrue(validacao);
	}
	
	@Test
	public void testAtualizar() {
		IDAO solicitanteDao=new SolicitanteDAO();
		List<Solicitante> lista = solicitanteDao.listarTodos();
		
		Solicitante solicitante=new Solicitante(lista.get(0).getCodigo(), "Maria da Silva", "88888888888");
		boolean validacao = solicitanteDao.atualizar(solicitante);
		Assert.assertTrue(validacao);
	}
	
	@Test
	public void testDeletar() {
		IDAO solicitanteDao=new SolicitanteDAO();
		List<Solicitante> lista = solicitanteDao.listarTodos();
		
		Solicitante solicitante=new Solicitante(lista.get(0).getCodigo(), "João da Silva", "99999999999");
		boolean validacao = solicitanteDao.deletar(solicitante);
		Assert.assertTrue(validacao);
	}	
	
	@Test
	public void testListarTodos() {
		IDAO solicitanteDao=new SolicitanteDAO();
		List<Solicitante> lista = solicitanteDao.listarTodos();
		Assert.assertTrue(lista.size() > 0);
	}
	
	@Test
	public void testObter() {
		IDAO solicitanteDao=new SolicitanteDAO();
		List<Solicitante> lista = solicitanteDao.listarTodos();
		
		Solicitante solicitante = (Solicitante) solicitanteDao.obter(lista.get(0).getCodigo());
		Assert.assertNotNull(solicitante);
	}
	
}
