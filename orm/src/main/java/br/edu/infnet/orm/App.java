package br.edu.infnet.orm;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Contato;
import br.edu.infnet.orm.modelo.entidade.Solicitante;
import br.edu.infnet.orm.modelo.entidade.TipoContato;
import br.edu.infnet.orm.modelo.persistencia.SolicitanteDAO;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
               
    	SolicitanteDAO solDAO = new SolicitanteDAO();  	
		
		  Solicitante solicitante = new Solicitante("Pedro Joaquim", "22222222222");
		  solicitante.setContatos(new ArrayList<>()); 
		  solicitante.getContatos().add(new  Contato(TipoContato.EMAIL, "pedro@gmail.com.br")); 
		  solicitante.getContatos().add(new  Contato(TipoContato.TELEFONE, "9999999999")); 
		  solicitante.getContatos().add(new  Contato(TipoContato.TELEFONE, "9888888888"));
		  
		  solDAO.salvar(solicitante);
		  
    	
//    	List<Solicitante> solicitantes = solDAO.listaTodos();
//    	System.out.println(solicitantes);
    	
    	
		/*
		 * for (Solicitante solicitante : solicitantes) {
		 * System.out.println(solicitante.getContatos()); }
		 */
    	
    	
    }
}
