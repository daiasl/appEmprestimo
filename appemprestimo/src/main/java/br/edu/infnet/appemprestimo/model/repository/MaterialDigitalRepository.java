package br.edu.infnet.appemprestimo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appemprestimo.model.domain.MaterialDigital;

@Repository
public interface MaterialDigitalRepository extends CrudRepository<MaterialDigital, Integer>{

}
