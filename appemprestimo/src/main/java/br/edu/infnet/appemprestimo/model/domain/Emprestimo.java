package br.edu.infnet.appemprestimo.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;

public class Emprestimo implements IPrinter {
	private Integer id;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucao;
	private Usuario usuario;
	private Set<Produto> produtos;
	
	public Emprestimo(Usuario usuario) {
		this.dataEmprestimo = LocalDateTime.now();
		this.usuario = usuario;
	}
	
	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Override
	public String toString() {		
		return "Empréstimo: " + dataEmprestimo + ";" + dataDevolucao + ";" + usuario + ";" + produtos.size();
	}

	@Override
	public void impressao() {
		System.out.println("#emprestimo");
		System.out.println(this);		
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
