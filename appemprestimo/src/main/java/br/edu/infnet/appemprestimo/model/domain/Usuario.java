package br.edu.infnet.appemprestimo.model.domain;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;
import br.edu.infnet.appemprestimo.model.exceptions.CpfInvalidoException;

public class Usuario implements IPrinter{
	
	
	private String nome;
	private String cpf;
	
	public Usuario(String nome, String cpf) throws CpfInvalidoException {	
		if(cpf == null) {
			throw new CpfInvalidoException ("Não é possível aceitar cpf nulo.");
		}
		if(cpf.isEmpty()) {
			throw new CpfInvalidoException ("Não é possível cpf sem preenchimento.");
		}
		
		this.cpf=cpf;	
		this.nome=nome;
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
