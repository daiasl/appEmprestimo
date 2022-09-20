package br.edu.infnet.appemprestimo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appemprestimo.model.domain.Revista;

@Repository
public interface RevistaRepository extends CrudRepository<Revista, Integer>{

}
