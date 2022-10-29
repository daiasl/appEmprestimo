package br.edu.infnet.emprestimo.modelo.entidades;

public class Produto {
	private Long codigo;
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", titulo=" + titulo + ", qtdExemplares=" + qtdExemplares
				+ ", valorUnitario=" + valorUnitario + "]";
	}
	private String titulo;
	private int qtdExemplares;
	private double valorUnitario;
	
	public Produto() {		
	}
	public Produto(Long codigo, String titulo, int qtdExemplares, double valorUnitario) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.qtdExemplares = qtdExemplares;
		this.valorUnitario = valorUnitario;
	}
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}	
	public int getQtdExemplares() {
		return qtdExemplares;
	}
	public void setQtdExemplares(int qtdExemplares) {
		this.qtdExemplares = qtdExemplares;
	}
		
}
