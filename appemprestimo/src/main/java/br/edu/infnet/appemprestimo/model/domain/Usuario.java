package br.edu.infnet.appemprestimo.model.domain;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;

public class Usuario implements IPrinter{
	private Integer id;
	private String nome;
	private String cpf;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
