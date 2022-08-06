package br.edu.infnet.appemprestimo.model.domain;

import java.time.LocalDateTime;

public class Emprestimo {

	private long id;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucao;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Override
	public String toString() {		
		return "Empréstimo:" + id + ";" + dataEmprestimo + ";" + dataDevolucao;
	}
}
