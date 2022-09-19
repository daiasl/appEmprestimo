package br.edu.infnet.appemprestimo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appemprestimo.model.domain.Solicitante;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer>{

}
