package br.edu.infnet.emprestimo.modelo.entidades;

import java.time.LocalDate;
import java.util.List;

public class Emprestimo {

	@Override
	public String toString() {
		return "Emprestimo [numero=" + numero + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao="
				+ dataDevolucao + ", solicitante=" + solicitante + ", produtos=" + produtos + "]";
	}

	private Long numero;	
	private LocalDate dataEmprestimo;	
	private LocalDate dataDevolucao;
	private Solicitante solicitante;
	private List<Produto> produtos;
		
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Emprestimo() {		
	}
		
	public Emprestimo(Long numero, LocalDate dataDevolucao, Solicitante solicitante) {
		super();
		this.numero = numero;
		this.dataEmprestimo = LocalDate.now();
		this.dataDevolucao = dataDevolucao;
		this.solicitante = solicitante;		
	}

	public Long getCodigo() {
		return numero;
	}

	public void setCodigo(Long codigo) {
		this.numero = codigo;
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
