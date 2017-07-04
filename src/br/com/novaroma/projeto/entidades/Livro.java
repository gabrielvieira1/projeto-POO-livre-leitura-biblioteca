package br.com.novaroma.projeto.entidades;

import java.io.Serializable;

public class Livro extends MaterialDidatico implements Serializable {

	private static final long serialVersionUID = 1L;
	private String titulo;
	private String autor;
	private int volume;
	private String numeroDeTombo;
	private int qtdLivros;

	public Livro() {
	}

	public Livro(String classificacao, String codigo, int edicao, String editora, String titulo, String autor,
			int volume, String numeroDeTombo, int qtdLivros) {
		super(classificacao, codigo, edicao, editora);
		this.titulo = titulo;
		this.autor = autor;
		this.volume = volume;
		this.numeroDeTombo = numeroDeTombo;
		this.qtdLivros = qtdLivros;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getNumeroDeTombo() {
		return numeroDeTombo;
	}

	public void setNumeroDeTombo(String numeroDeTombo) {
		this.numeroDeTombo = numeroDeTombo;
	}

	public int getQtdLivros() {
		return qtdLivros;
	}

	public void setQtdLivros(int qtdLivros) {
		this.qtdLivros = qtdLivros;
	}

}
