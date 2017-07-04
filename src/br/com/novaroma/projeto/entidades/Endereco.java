package br.com.novaroma.projeto.entidades;

import java.io.Serializable;

public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	private String rua;
	private String bairro;
	private int numero;
	private String cep;
	private String complemento;

	public Endereco() {
	}

	public Endereco(String rua, String bairro, int numero, String cep, String complemento) {
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
