package br.edu.infnet.appemprestimo.model.domain;

public class Usuario {
	private long id;
	private String nome;
	private String cpf;
	
	public Usuario(long id, String nome, String cpf) {
		this.id=id;
		this.nome=nome;
		this.cpf=cpf;	
	}	
	
	@Override
	public String toString() {		
		return "Usuário:" + id + ";" + nome + ";" + cpf;
	}	
	
}
