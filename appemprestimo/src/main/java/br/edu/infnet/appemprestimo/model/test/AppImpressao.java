package br.edu.infnet.appemprestimo.model.test;

import br.edu.infnet.appemprestimo.interfaces.IPrinter;

public class AppImpressao {
	public static void relatorio (String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		printer.impressao();
	}
}
