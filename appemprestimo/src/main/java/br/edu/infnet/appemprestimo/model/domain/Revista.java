package br.edu.infnet.appemprestimo.model.domain;

public class Revista {
	public String issn;	
	public int edicao;	
	public int ano;
		
	@Override
	public String toString() {		
		return "Revista:" + issn + ";" + edicao + ";" + ano;
	}
}
