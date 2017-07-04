package br.com.novaroma.projeto.entidades;

import java.io.Serializable;

public abstract class MaterialDidatico extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;
	private String classificacao;
	private String codigo;
	private int edicao;
	private String editora;

	protected MaterialDidatico() {
	}

	public MaterialDidatico(String classificacao, String codigo, int edicao, String editora) {
		this.classificacao = classificacao;
		this.codigo = codigo;
		this.edicao = edicao;
		this.editora = editora;

	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String getId() {
		return this.getCodigo();
	}
}
