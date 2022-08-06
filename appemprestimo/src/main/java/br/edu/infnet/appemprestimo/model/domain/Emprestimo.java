package br.edu.infnet.appemprestimo.model.domain;

import java.time.LocalDateTime;

public class Emprestimo {

	public long id;
	public LocalDateTime dataEmprestimo;
	public LocalDateTime dataDevolucao;
	
	@Override
	public String toString() {		
		return "Empréstimo:" + id + ";" + dataEmprestimo + ";" + dataDevolucao;
	}
}
