package br.edu.infnet.appemprestimo.model.domain;

import java.time.LocalDateTime;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;

public class Emprestimo implements IPrinter {
	
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucao;
	
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
		return "Empréstimo: " + dataEmprestimo + ";" + dataDevolucao;
	}

	@Override
	public void impressao() {
		System.out.println("#emprestimo");
		System.out.println(this);		
	}
	
}
