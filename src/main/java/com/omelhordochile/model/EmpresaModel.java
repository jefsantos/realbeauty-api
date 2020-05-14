package com.omelhordochile.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Table(name = "tabela_empresa")
@Entity
public class EmpresaModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_empresa;
	String nome;


	@OneToMany(mappedBy = "empresaModel", cascade = CascadeType.ALL)
	private List<CarroModel> carros = new ArrayList<>(); 

	public EmpresaModel() {

	}

	public EmpresaModel(int id_empresa, String nome, String modeloCarro, int quantidadeTotal, int quantidadeLivre
			) {
		super();
		this.id_empresa = id_empresa;
		this.nome = nome;

	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<CarroModel> getCarros() {
		return carros;
	}

	public void setCarros(List<CarroModel> carros) {
		this.carros = carros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_empresa;
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
		EmpresaModel other = (EmpresaModel) obj;
		if (id_empresa != other.id_empresa)
			return false;
		return true;
	}


}
