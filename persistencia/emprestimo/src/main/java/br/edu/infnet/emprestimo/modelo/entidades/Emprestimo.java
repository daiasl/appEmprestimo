package br.edu.infnet.emprestimo.modelo.entidades;

import java.time.LocalDate;
import java.util.List;

public class Emprestimo {

	private Long codigo;	
	private LocalDate dataEmprestimo;	
	private LocalDate dataDevolucao;
	private Solicitante solicitante;
	private List<Produto> produtos;
		
	public Emprestimo() {
		this.dataEmprestimo = LocalDate.now();
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	
}
