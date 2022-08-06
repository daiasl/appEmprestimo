package br.edu.infnet.appemprestimo.model.domain;

public class Produto {
	public long id;
	public String titulo;
	public int estante;
	public String codigoBarras;
	public int qtdExemplares;
	public int qtdDisponiveis;
	
	@Override
	public String toString() {		
		return "Produto:" + id + ";" + titulo + ";" + estante + ";" + codigoBarras + ";" + qtdExemplares + ";" + qtdDisponiveis;
	}
}
