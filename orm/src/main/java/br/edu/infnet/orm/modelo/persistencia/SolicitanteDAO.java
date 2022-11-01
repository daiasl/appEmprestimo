package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Solicitante;
import jakarta.persistence.EntityManager;

public class SolicitanteDAO {
	private EntityManager em;
	
	public SolicitanteDAO(){		
		em = JpaUtil.createEntityManager();		
	}
	
	public void salvar (Solicitante solicitante) {
		em.getTransaction().begin();    	
    	em.persist(solicitante);
    	em.getTransaction().commit();
	}
	public void atualizar (Solicitante solicitante) {
		em.getTransaction().begin();    	
    	em.merge(solicitante);
    	em.getTransaction().commit();
	}
	public void deletar (Solicitante solicitante) {
		em.getTransaction().begin();    	
    	em.remove(solicitante);
    	em.getTransaction().commit();
	}
	public Solicitante obter (Long id) {
		return em.find(Solicitante.class, id);
	}
	public List<Solicitante> listaTodos(){
		return em.createQuery("select s from solicitante s").getResultList();
	}
	
}
