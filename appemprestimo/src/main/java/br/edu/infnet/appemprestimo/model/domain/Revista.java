package br.edu.infnet.appemprestimo.model.domain;

public class Revista extends Produto {
	private String issn;	
	private int edicao;	
	private int ano;
	
	@Override
	public int CalculaQtdProdutoEmprestado() {		
		System.out.println("Calcula qtd produtos emprestados - revista:");
		int qtdRevista = (ano==2022) ? 1 : 0;		
		//return super.CalculaQtdProdutoEmprestado() + qtdRevista;
		return qtdExemplares - getQtdDisponiveis() + qtdRevista;
	}
		
	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {		
		return "Revista:" + issn + ";" + edicao + ";" + ano + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#revista");
		System.out.println(this);
	}
}
