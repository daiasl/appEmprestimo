package br.edu.infnet.orm.modelo.entidade;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Solicitante {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;		
	private String nome;
	private String cpf;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Contato> contatos;
		
	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

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
