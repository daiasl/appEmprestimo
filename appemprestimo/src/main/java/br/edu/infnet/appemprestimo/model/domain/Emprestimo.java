package br.edu.infnet.appemprestimo.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;
import br.edu.infnet.appemprestimo.model.exceptions.EmprestimoSemProdutoException;
import br.edu.infnet.appemprestimo.model.exceptions.SolicitanteNuloException;

public class Emprestimo implements IPrinter {
	private Integer id;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucao;
	private Solicitante solicitante;
	private Set<Produto> produtos;
	
	public Emprestimo(Solicitante solicitante, Set<Produto> produtos) throws SolicitanteNuloException, EmprestimoSemProdutoException {
		
		if(solicitante == null){
			throw new SolicitanteNuloException("Não é permitido realiza empréstimo sem solicitante.");
		}
		//if (produtos == null) {
		//	throw new EmprestimoSemProdutoException("Impossível realizar um empréstimo sem uma listagem de produtos associados!");
		//}		
		//if (produtos.size()<1) {
		//	throw new EmprestimoSemProdutoException("Impossível realizar um empréstimo com menos de um produto!");
		//}
		
		this.dataEmprestimo = LocalDateTime.now();
		this.solicitante = solicitante;
		this.produtos = produtos;
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
		return "Empréstimo: " + dataEmprestimo + ";" + dataDevolucao + ";" + solicitante + ";" + produtos.size();
	}

	@Override
	public void impressao() {
		System.out.println("#emprestimo");
		System.out.println(this);		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}
}
