package com.omelhordochile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.omelhordochile.utils.SenhaUtils;

@Table(name = "tabela_pessoa")
@Entity
public class PessoaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa")
	private Integer id;




	@Column(name = "ds_nome")
	private String nome;

	@Column(name = "email")
	private String email;
	
	@Column(name = "senha", nullable = false)
	private String  senha;
	
	@Column(name = "Telefone_Whatsapp")
	private String whatsapp;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}
	

	public void setSenha(String senha) {
		this.senha = SenhaUtils.gerarBCrypt(senha);
	}
	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	
	

}