package br.edu.infnet.appemprestimo.model.domain;

public class Usuario {
	public long id;
	public String nome;
	public String cpf;
	
	@Override
	public String toString() {		
		return "Usuário:" + id + ";" + nome + ";" + cpf;
	}
}
