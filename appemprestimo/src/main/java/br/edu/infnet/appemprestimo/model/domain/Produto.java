package br.edu.infnet.appemprestimo.model.domain;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;

public abstract class Produto implements IPrinter{
	
	private String titulo;
	private int estante;
	private String codigoBarras;
	protected int qtdExemplares;
	private int qtdDisponiveis;
	
	public abstract int CalculaQtdProdutoEmprestado();
	
	/*public int CalculaQtdProdutoEmprestado() {
		System.out.println("Calcula qtd produtos emprestados - mãe:");
		return qtdExemplares - qtdDisponiveis;
	}*/
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public int getQtdExemplares() {
		return qtdExemplares;
	}

	public void setQtdExemplares(int qtdExemplares) {
		this.qtdExemplares = qtdExemplares;
	}

	public int getQtdDisponiveis() {
		return qtdDisponiveis;
	}

	public void setQtdDisponiveis(int qtdDisponiveis) {
		this.qtdDisponiveis = qtdDisponiveis;
	}

	@Override
	public String toString() {		
		return titulo + ";" + estante + ";" + codigoBarras + ";" + qtdExemplares + ";" + qtdDisponiveis + ";" + CalculaQtdProdutoEmprestado();
	}

	
		
}
