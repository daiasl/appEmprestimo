package br.edu.infnet.appemprestimo.model.exceptions;

public class UsuarioNuloException extends Exception {

	private static final long serialVersionUID = 1L;

	public UsuarioNuloException(String mensagem) {
		super(mensagem);
	}

}
