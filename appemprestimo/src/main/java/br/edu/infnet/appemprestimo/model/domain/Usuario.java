package br.edu.infnet.appemprestimo.model.domain;

public class Usuario {
	
	private String nome;
	private String cpf;
	
	public Usuario(String nome, String cpf) {	
		this.nome=nome;
		this.cpf=cpf;	
	}	
	
	@Override
	public String toString() {		
		return "Usuário: " + nome + ";" + cpf;
	}	
	
}
