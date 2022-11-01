package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "tipo_contato")
	@Enumerated(EnumType.STRING)
	private TipoContato tipo;
	
	private String valor;
	
	public Contato() {		
	}	
	
	public Contato(TipoContato tipo, String valor) {
		super();		
		this.tipo = tipo;
		this.valor = valor;
	}
		
	public TipoContato getTipo() {
		return tipo;
	}

	public void setTipo(TipoContato tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Long getId() {
		return id;
	}
	

}
