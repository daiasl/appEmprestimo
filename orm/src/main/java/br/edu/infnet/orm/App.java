package br.edu.infnet.orm;

import br.edu.infnet.orm.modelo.entidade.Solicitante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
               
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();    	
    	em.getTransaction().begin();
    	Solicitante solicitante = new Solicitante("José da Silva", "22222222222");
    	em.persist(solicitante);
    	em.getTransaction().commit();
    	
    	
    }
}
