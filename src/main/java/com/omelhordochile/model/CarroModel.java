package com.omelhordochile.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "tabela_carro")
@Entity
public class CarroModel implements Serializable{

	private static final long serialVersionUID = 1L;



	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_Carro;
	String modelo;
	int quantidade_Vagas;
	int quantidade_Livre;
	
	
	@ManyToOne(fetch = FetchType.EAGER) //trazer carro e empresa
	@JoinColumn(name="empresa_id")
	private EmpresaModel empresaModel;
	
		
	public CarroModel() {
		
	}
	

	public CarroModel(int id_Carro, String modelo, int quantidade_Vagas, int quantidade_Livre,
			EmpresaModel empresaModel) {
		super();
		this.id_Carro = id_Carro;
		this.modelo = modelo;
		this.quantidade_Vagas = quantidade_Vagas;
		this.quantidade_Livre = quantidade_Livre;
		this.empresaModel = empresaModel;
	}


	public int getId_Carro() {
		return id_Carro;
	}

	public void setId_Carro(int id_Carro) {
		this.id_Carro = id_Carro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidade_Vagas() {
		return quantidade_Vagas;
	}

	public void setQuantidade_Vagas(int quantidade_Vagas) {
		this.quantidade_Vagas = quantidade_Vagas;
	}

	public int getQuantidade_Livre() {
		return quantidade_Livre;
	}

	public void setQuantidade_Livre(int quantidade_Livre) {
		this.quantidade_Livre = quantidade_Livre;
	}

	public EmpresaModel getEmpresaModel() {
		return empresaModel;
	}

	public void setEmpresaModel(EmpresaModel empresaModel) {
		this.empresaModel = empresaModel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_Carro;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarroModel other = (CarroModel) obj;
		if (id_Carro != other.id_Carro)
			return false;
		return true;
	}


	
	
}
