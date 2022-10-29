package br.edu.infnet.emprestimo.modelo.persistencia;

import java.util.List;

public interface IDAO<T> {

	boolean incluir(T obj);

	Boolean atualizar(T obj);

	Boolean deletar(T obj);

	List<T> listarTodos();

	T obter(Long codigo);

}