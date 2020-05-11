package com.omelhordochile.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "Tabela_Passeios")
@Entity
public class PasseioModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_passeio;
	String nome_passeio;
	String valor_passeio;
	
	public PasseioModel() {
		
	}
	
	
	public PasseioModel(int id_passeio, String nome_passeio, String valor_passeio) {
		super();
		this.id_passeio = id_passeio;
		this.nome_passeio = nome_passeio;
		this.valor_passeio = valor_passeio;
	}


	public int getId_passeio() {
		return id_passeio;
	}


	public void setId_passeio(int id_passeio) {
		this.id_passeio = id_passeio;
	}


	public String getNome_passeio() {
		return nome_passeio;
	}


	public void setNome_passeio(String nome_passeio) {
		this.nome_passeio = nome_passeio;
	}


	public String getValor_passeio() {
		return valor_passeio;
	}


	public void setValor_passeio(String valor_passeio) {
		this.valor_passeio = valor_passeio;
	}


	@Override
	public String toString() {
		return "PasseioModel [id_passeio=" + id_passeio + ", nome_passeio=" + nome_passeio + ", valor_passeio=" + valor_passeio + "]";
	}
	
	
	
	
}