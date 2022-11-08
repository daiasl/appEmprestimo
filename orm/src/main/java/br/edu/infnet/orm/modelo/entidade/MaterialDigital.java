package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;

@Entity
public class MaterialDigital extends Produto{
	private String doi;	
	private int volume;	
	private int ano;
	private String linkDoi;
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getLinkDoi() {
		return linkDoi;
	}
	public void setLinkDoi(String linkDoi) {
		this.linkDoi = linkDoi;
	}
	
}
