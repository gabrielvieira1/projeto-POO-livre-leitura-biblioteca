package br.com.novaroma.projeto.entidades;

import java.io.Serializable;

public class MaterialEspecial extends MaterialDidatico implements Serializable {

	private static final long serialVersionUID = 1L;
	private String marca;

	public MaterialEspecial() {
	}

	public MaterialEspecial(String classificacao, String codigo, int edicao, String editora, String marca) {
		super(classificacao, codigo, edicao, editora);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
