package br.edu.infnet.appemprestimo.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;
import br.edu.infnet.appemprestimo.model.exceptions.EmprestimoSemProdutoException;
import br.edu.infnet.appemprestimo.model.exceptions.UsuarioNuloException;

public class Emprestimo implements IPrinter {
	private Integer id;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucao;
	private Usuario usuario;
	private Set<Produto> produtos;
	
	public Emprestimo(Usuario usuario, Set<Produto> produtos) throws UsuarioNuloException, EmprestimoSemProdutoException {
		
		if(usuario == null){
			throw new UsuarioNuloException("Não é permitido realiza empréstimo sem usuário.");
		}
		if (produtos == null) {
			throw new EmprestimoSemProdutoException("Impossível realizar um empréstimo sem uma listagem de produtos associados!");
		}		
		if (produtos.size()<1) {
			throw new EmprestimoSemProdutoException("Impossível realizar um empréstimo com menos de um produto!");
		}
		
		this.dataEmprestimo = LocalDateTime.now();
		this.usuario = usuario;
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
		return "Empréstimo: " + dataEmprestimo + ";" + dataDevolucao + ";" + usuario + ";" + produtos.size();
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
}
