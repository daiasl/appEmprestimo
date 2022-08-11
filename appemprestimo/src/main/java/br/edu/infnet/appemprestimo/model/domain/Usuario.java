package br.edu.infnet.appemprestimo.model.domain;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;

public class Usuario implements IPrinter{
	
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

	@Override
	public void impressao() {
		System.out.println("#usuario");
		System.out.println(this);		
	}	
	
}
