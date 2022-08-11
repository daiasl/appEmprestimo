package br.edu.infnet.appemprestimo.model.domain;

public class Livro extends Produto{
	private String isbn;	
	private int volume;	
	private int edicao;
	private int anoPublicacao;
	private String nomeAutor;
	
	@Override
	public int CalculaQtdProdutoEmprestado() {		
		return (getQtdExemplares() - ((anoPublicacao==2022) ? 3 : 2));
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	@Override
	public String toString() {		
		return "Livro:" + isbn + ";" + volume + ";" + edicao + ";" + anoPublicacao + ";" + nomeAutor + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#livro");
		System.out.println(this);		
	}
}
