package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Solicitante {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;		
	private String nome;
	private String cpf;
	
	@Override
	public String toString() {
		return "Solicitante [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	public Solicitante() {		
	}
	
	public Solicitante(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf=cpf;
	}
	
	public Solicitante(Long codigo2, String nome2, String cpf2) {
		this.codigo = codigo2;
		this.nome = nome2;
		this.cpf = cpf2;		
	}

	public Long getCodigo() {
		return codigo;
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
	
	
}
