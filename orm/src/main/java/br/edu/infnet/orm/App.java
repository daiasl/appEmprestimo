package br.edu.infnet.orm;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Contato;
import br.edu.infnet.orm.modelo.entidade.Livro;
import br.edu.infnet.orm.modelo.entidade.Produto;
import br.edu.infnet.orm.modelo.entidade.Solicitante;
import br.edu.infnet.orm.modelo.entidade.TipoContato;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.ProdutoDAO;
import br.edu.infnet.orm.modelo.persistencia.SolicitanteDAO;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
           
    	ProdutoDAO dao = new ProdutoDAO();
    	
		/*
		 * Produto produto = new Produto(); produto.setTitulo("Livro x");
		 * produto.setQtdExemplares(10); produto.setValorUnitario(10);
		 * dao.salvar(produto);
		 */
    	//dao.obterPeloNome(null);
    	
    	Livro livro = new Livro();
    	livro.setIsbn("123A");
    	livro.setAnoPublicacao(2022);
    	livro.setEdicao(1);
    	livro.setNomeAutor("Martin Foller");
    	livro.setQtdExemplares(10);
    	livro.setTitulo("Clean Code");
    	livro.setValorUnitario(10);
    	livro.setVolume(1);
    	dao.salvar(livro);
    	System.out.println(dao.listaTodos());
    	
    	
    	
    	
    	
    	
		/*
		 * IDAO solDAO = new SolicitanteDAO();
		 * 
		 * Solicitante solicitante = new Solicitante("Pedro Joaquim", "22222222222");
		 * solicitante.setContatos(new ArrayList<>()); solicitante.getContatos().add(new
		 * Contato(TipoContato.EMAIL, "pedro@gmail.com.br"));
		 * solicitante.getContatos().add(new Contato(TipoContato.TELEFONE,
		 * "9999999999")); solicitante.getContatos().add(new
		 * Contato(TipoContato.TELEFONE, "9888888888"));
		 * 
		 * solDAO.salvar(solicitante);
		 */
		  
    	
//    	List<Solicitante> solicitantes = solDAO.listaTodos();
//    	System.out.println(solicitantes);
    	
    	
		/*
		 * for (Solicitante solicitante : solicitantes) {
		 * System.out.println(solicitante.getContatos()); }
		 */
    	
    	
    }
}
