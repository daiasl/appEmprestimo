package br.edu.infnet.appemprestimo.model.domain;

public class Livro {
	public String isbn;	
	public int volume;	
	public int edicao;
	public int anoPublicacao;
	public String nomeAutor;
	
	@Override
	public String toString() {		
		return "Livro:" + isbn + ";" + volume + ";" + edicao + ";" + anoPublicacao + ";" + nomeAutor;
	}
}
