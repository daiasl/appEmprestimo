package br.edu.infnet.appemprestimo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appemprestimo.model.domain.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer>{

}
