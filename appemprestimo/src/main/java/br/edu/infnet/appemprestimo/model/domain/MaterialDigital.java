package br.edu.infnet.appemprestimo.model.domain;

public class MaterialDigital {
	public String doi;	
	public int volume;	
	public int ano;
	public String linkDoi;
		
	@Override
	public String toString() {		
		return "Material Digital:" + doi + ";" + volume + ";" + ano + ";" + linkDoi;
	}
}
